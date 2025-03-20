/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.plastilina.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Pato {
    
    public String nombre;
    public Float peso;
    public Float altura;
    public String color;
    
    
    /** 
     * Hace que el pato vuele por las alturas
     * @param alturaVuelo indica la altura en metros en la que esta volando el pato
     * @return Mensaje enviado por el pato que expresa su altura.
     */
    public String volar(int alturaVuelo){
        return "Estoy volando a" + alturaVuelo + "metros de altura";
        
        
        
    }
    
}
