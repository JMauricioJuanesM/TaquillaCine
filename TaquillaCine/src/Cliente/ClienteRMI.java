/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.RMIOperaciones;
import java.io.File;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sndmonreal
 */
public class ClienteRMI {
    private static String[] listaPeliculas;
    private static RMIOperaciones objRemoto;
    private static int indice=0;

    public static void main(String args[]) {
        try {
            // obtener el registro del servidor
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            // CREAR LA REFERENCIA AL OBJ REMOTO
            objRemoto = (RMIOperaciones)reg.lookup("se me fue la luz");
            menu();
           
  
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void menu() throws RemoteException{
        System.out.println("Elija 1, para listar todas las películas, \n 2 para comprar boleto \n o 3 para salir.");
        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        listarPeliculas();
        while (true) {
            System.out.print("> ");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                listarPeliculas();
            } else if (userInput.equalsIgnoreCase("2")) {
                pedirBoleto();
            } else if (userInput.equalsIgnoreCase("3")) {
                break;
            } else {
                System.out.println("Opcion invalida. Intente de nuevo");
            }
        }
    }
    
    public static void listarPeliculas() throws RemoteException{
        listaPeliculas = objRemoto.listarPeliculas();
        for(int i=0;i<listaPeliculas.length;i++){
                System.out.println((i+1)+". "+listaPeliculas[i]);
        }
   }
    
    public static void pedirBoleto() throws RemoteException{
        System.out.println("Introduzca su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = null;
        nombre = scanner.nextLine();
        String pelicula = null;
        while(true){
            System.out.println("Introduzca el nombre de la pelicula: ");
            pelicula = scanner.nextLine();
            if(!peliculaValida(pelicula)){
                System.out.println("Pelicula no disponible");
            }else{
                break;
            }
        }
        System.out.println("Introduzca la cantidad de boletos: ");
        int num_boletos = 0;
        num_boletos = Integer.parseInt(scanner.nextLine());
        
        String boleto = objRemoto.enviarCliente(nombre, pelicula, num_boletos);
        
        System.out.println("Boleto: \n"+boleto);
        guardarBoleto(boleto, "Boletos"+"/boleto"+nombre+indice+".txt");
        indice++;
    }
    
    public static void guardarBoleto(String contenido, String nombre){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(nombre);
            pw = new PrintWriter(fichero);
            
            pw.println(contenido);

            /*for(int x=0; x<m[0].length;x++){
                for(int y=0; y <m.length ; y++){
                    if(y==m.length-1) pw.println(m[x][y]+"");
                    else pw.print(m[x][y]+",");
                    
                }
            }*/
               
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
                if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

    }
    
    public static Boolean peliculaValida(String pelicula){
        for(int i=0;i<listaPeliculas.length;i++){
            if(pelicula.equalsIgnoreCase(listaPeliculas[i])){
                return true;
            }
        }
        return false;
    }
}
