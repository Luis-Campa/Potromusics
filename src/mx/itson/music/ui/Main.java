/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.enums.Género;

/**
 *
 * @author janto
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Artista artista = new Artista();
        System.out.println("Ingrese el nombre del artista:");
        artista.setNombre(scanner.nextLine());
         System.out.println("Ingrese el sitio web del artista:");
        artista.setSitioWeb(scanner.nextLine());
         
         
         
        Album a = new Album();
        a.setArtista(artista);
        System.out.println("Ingrese le nombre del album:");
        a.setNombre(scanner.nextLine());
        System.out.println("Ingrese el año del lanzamiento");
        a.setLanzamiento(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingrese el genero:");
        System.out.println("Generos disponibles");
        for (Género g : Género.values()) {
            System.out.println(g);      
                  
        }
         List<Canción> canciones = new ArrayList<>();
        
        
       
       a.setCanciones(canciones);
        
        while (true){
            System.out.println("Desea agregar una cancion (1.SI / 2.NO)");
            int respuesta = scanner.nextInt();
            scanner.nextLine();
            
            if (respuesta == 1){
             
        Canción cancion = new Canción();
            
            System.out.print("Ingrese el nombre de la canción: ");
            cancion.setNombre(scanner.nextLine());
           System.out.print("Ingrese la duración en segundos: ");
            cancion.setDuración(scanner.nextInt());
            scanner.nextLine();
            
            
            
            
            canciones.add(cancion);
           

        
            
            }
            
             if (respuesta == 2){
                      break;}
            
            
        
       }
       
        System.out.println("🎵 Álbum: " + a.getNombre());
        System.out.println("🎤 Artista: " + artista.getNombre());
        System.out.println("🌐 Sitio Web: " + artista.getSitioWeb());
        System.out.println("📅 Lanzamiento: " + a.getLanzamiento());
        System.out.println("🎶 Género: " + a.getGénero());
        System.out.println("📀 Canciones:");
       for (Canción c : a.getCanciones()) {
            System.out.println("   🎵 " + c.getNombre() + " (⏱ " + c.getDuración() + "s)");
    }
    }
}

        
        
        
        
        
        
    
        
       

