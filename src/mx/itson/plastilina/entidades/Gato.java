/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.plastilina.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Gato {
    
    
    public String nombre;
    public Float peso;
    public Float altura;
    public String color;
    public int patas;
    
    
    /**
     * 
     * hace que el gato salte
     * @param alturaSalto altura a la que salta el gato
     * @return mensaje del gato
     */
    
     public String salto(int alturaSalto){
        return "Estoy saltando a" + alturaSalto + "metros de altura";
        
     }
    
}
