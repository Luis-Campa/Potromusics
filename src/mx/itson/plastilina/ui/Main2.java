/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.plastilina.ui;

import mx.itson.plastilina.entidades.Gato;

/**
 *
 * @author luisantoniocamparubio
 */
public class Main2 {
    
    public static void main(String[] args) {
        
        
        Gato tigrillo = new Gato();
        tigrillo.nombre = "Juanito pistolas ";
        tigrillo.color = "negro y blanco";
        tigrillo.peso = 3.1f;
        tigrillo.altura = 40f;
        
        System.out.println(tigrillo.salto(800));
    }
}
