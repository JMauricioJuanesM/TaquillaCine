/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.util.Random;

/**
 *
 * @author mauriciojuanes
 */
public class Cajero {
    private String nombre;
    private int clientes_atendidos = 0;
    //private Boolean ocupado;
    
    public Cajero(){
        this.nombre = setRanName();
        //this.ocupado = false; 
    }

    public int getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }
    
    public void addCliente_atendido() {
        this.clientes_atendidos++;
    }
    
    private String setRanName(){
        String[] nombres = {
        "Mario", "Fernando", "Carlos", "Daniela", "Josefina", "Gloria", "Ernestina", "José", "Rosendo", "Kenia"  
        };
        Random rand = new Random();
        int index = rand.nextInt(nombres.length);
        
        return nombres[index];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }*/
    
}
