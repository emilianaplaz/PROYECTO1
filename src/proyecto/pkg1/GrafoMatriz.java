/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emilianaplaz
 */
public class GrafoMatriz {
    private int num_vertices;
    private boolean [][] matriz_adyacencia;
    
    public GrafoMatriz(int num_vertices){
        this.num_vertices=num_vertices;
        matriz_adyacencia=new boolean [num_vertices][num_vertices];        
    }
     
    
    public void agregar_conexion(int origen, int destino){
        matriz_adyacencia[origen][destino]=true;
    }
    
    public void imprimir_grafo(){
        for (int i=0; i<num_vertices; i++){
            System.out.print(i+": ");
            for(int j=0;j<num_vertices;j++){
                System.out.print(matriz_adyacencia[i][j] + "");
            }
            System.out.println();
        }
    }
    
    public void cargar_datos(String nombre_archivo) {
        File archivo = new File(nombre_archivo);
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

      // Leer usuarios
            String linea;
            for (int i = 0; i < num_vertices; i++) {
            linea = br.readLine();
      }

      // Leer relaciones
            br.readLine(); // Saltar la línea "relaciones"
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(", ");
                int origen = Integer.parseInt(partes[0].substring(1));
                int destino = Integer.parseInt(partes[1].substring(1));
                agregar_conexion(origen, destino);
      }

            br.close();
            fr.close();
            
    } catch (Exception err) {
        System.out.println("No se pudo encontrar el archivo.");
    }
  }
    
    public void imprimir_matriz() {
        for (int i = 0; i < num_vertices; i++) {
            for (int j = 0; j < num_vertices; j++) {
                System.out.print(matriz_adyacencia[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

