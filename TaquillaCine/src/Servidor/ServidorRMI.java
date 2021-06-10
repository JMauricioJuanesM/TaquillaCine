/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author sndmonreal
 */
public class ServidorRMI {
    public static void main(String args[]){
        try{
            interfaz inicio = new interfaz();
            //final interfaz.Crear c = new interfaz.Crear(); 
            ObjetoRemoto obj= new ObjetoRemoto(inicio);
            inicio.setClientes(obj.clientes);
            // hacer registro del obj remoto
            Registry reg = LocateRegistry.createRegistry(1099);
            // refencia al objeto remoto
            reg.rebind("se me fue la luz", obj);
            System.out.println("Este servidor esta activo... bueno si no se va la luz otra vez");
            
            //Funciones de taquilla
            
            inicio.setVisible (true);  
           
            inicio.dormir(1);
            inicio.dormir(2);
            inicio.dormir(3);
            inicio.quitarCliente(1);
            inicio.quitarCliente(2);
            inicio.quitarCliente(3);
            
        }catch(RemoteException e){
            e.printStackTrace();
    }
    }
    
}
