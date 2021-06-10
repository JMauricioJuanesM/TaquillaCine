/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;
import Cliente.Cliente;
import java.rmi.Remote;
import java.rmi.RemoteException;
        
/**
 *
 * @author sndmonreal
 */
public interface RMIOperaciones  extends Remote{
    public String[] listarPeliculas()throws RemoteException;
    public String enviarCliente(String nombre, String pelicula, int num_boletos)throws RemoteException;

}
