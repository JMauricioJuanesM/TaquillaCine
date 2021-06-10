/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Cliente.Cliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author sndmonreal
 */
public class ObjetoRemoto extends UnicastRemoteObject implements RMIOperaciones{
    
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();  
    interfaz inicio = new interfaz();
    
    public ObjetoRemoto(interfaz inicio)throws RemoteException{
        super();
        this.inicio = inicio;
    }
    public String enviarCliente(String nombre, String pelicula, int num_boletos)throws RemoteException{
        Cliente cli = new Cliente(nombre, pelicula, num_boletos);
        clientes.add(cli);
        inicio.llamarProceso();
        
        String boleto = "";
        boleto+="Nombre: "+cli.getNombre()+"\n";
        boleto+="Pelicula: "+cli.getPelicula()+"\n";
        boleto+="Num. Boletos: "+cli.getNum_boletos()+"\n";
        boleto+="Total: $"+cli.getCantidad_a_pagar()+"\n";
        
        return boleto;
    }
    
    @Override
    public String[] listarPeliculas() throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String[] listaPeliculas = {"Avatar", "Cars", "El Conjuro", "Toy Story", "Volver al Futuro"};
        return listaPeliculas;
    }
    
}
