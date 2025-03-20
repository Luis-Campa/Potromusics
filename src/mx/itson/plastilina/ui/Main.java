/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.plastilina.ui;

import mx.itson.plastilina.entidades.Pato;

/**
 *
 * @author luisantoniocamparubio
 */
public class Main {
    
    public static void main(String[] args) {
        // creamos un objeto llama juancho el cual es ua instancia de la clase pato
        // luego en las siguientes lineas asignamos valores a los atrivutos de la clase pato
        Pato juancho = new Pato();
        juancho.nombre = "Juanito pistolas ";
        juancho.color = "negro y blanco";
        juancho.peso = 3.1f;
        juancho.altura = 40f;
        
        System.out.println(juancho.volar(50));
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
