/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.util.Random;
/**
 * @author mauriciojuanes
 */
public class Cliente implements java.io.Serializable{
    private String nombre;
    private String pelicula;
    private int num_boletos;
    private int cantidad_a_pagar;
    
    public Cliente(String nombre, String pelicula, int num_boletos){
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.num_boletos = num_boletos;
        cantidad_a_pagar = num_boletos*100;
    }
    
    private String setRanName(){
        String[] nombres = {
        "Francisco", "Abel", "María", "Sandra", "Juan","Karen", "José", "Ana", "Elmer", "Anastacio"  
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

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getNum_boletos() {
        return num_boletos;
    }

    public void setNum_boletos(int num_boletos) {
        this.num_boletos = num_boletos;
    }

    public int getCantidad_a_pagar() {
        return cantidad_a_pagar;
    }

    public void setCantidad_a_pagar(int cantidad_a_pagar) {
        this.cantidad_a_pagar = cantidad_a_pagar;
    }
    
    private String setRanMovie(){
        String[] nombres = {
        "La Llorona", "Cars", "Nacho Libre", "Terminator", "Avatar","Roma", "Avangers", "Titanic", "Volver al Futuro", "Quinto Elemento"  
        };
        Random rand = new Random();
        int index = rand.nextInt(nombres.length);
        
        return nombres[index];
    }
    
    private int setRanNum(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        num++;
        return num;
    }
}
