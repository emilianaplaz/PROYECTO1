/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author emilianaplaz
 */
public class MatrizAdyacencia {
    
    public MatrizAdyacencia () {
    }
    
    
   
    public void crear_matriz() {
        String file = "test//usuarios.txt";
        

        try {
            
            FileReader fr = new FileReader(file);
            

            // Contar usuarios
            BufferedReader reader = new BufferedReader(fr);

            String line;
            int userCount = 0;
            while ((line = reader.readLine()) != null) {
                if (line.equals("relaciones:")) {
                    break;
                } else if (line.contains("@")) {
                    String user = line.trim().substring(1);
                    userCount++;
                }
                
            }
            
            //System.out.println(userCount);
            
            //Contar relaciones            
            reader = new BufferedReader(fr);
            String line3;
            int relCount = 0;
            while ((line3 = reader.readLine()) != null) {
                if (line3.contains(",")) {
                    relCount++;
                }
                
            }
            //System.out.println(relCount);
            
            // Inicializar la lista_usuarios 
          
            String[] lista_usuarios = new String[userCount];
            int index = 0;
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.equals("relaciones:")) {
                    break;
                } else if (line.contains("@")) {
                    String user = line;
                    lista_usuarios[index] = user;
                    index++;
                }
            }
            
            //for (int i =0;i<lista_usuarios.length;i++){
            //System.out.println(lista_usuarios[i]);}
            //System.out.println(index);
            

            
            //Crear la matriz
            int[][] matriz=new int [index][index];
            for (int i =0; i<index;i++){
                for(int j =0; j<index;j++){
                    matriz[i][j]= 0;
                    
                }
                
            }

            //Inicializar lista relaicones
            FileReader fr2 = new FileReader(file);
            BufferedReader reader2 = new BufferedReader(fr2);            
            while ((line = reader2.readLine()) != null) {
                if (line.contains(",")){
                    String[] relacion = line.split(",");
                    String user1=relacion[0];
                    String user2=relacion[1];
                    int index1 = getIndex(lista_usuarios,userCount,user1);
                    int index2 = getIndex(lista_usuarios,userCount,user2);
                    if (index1 != -1 && index2 != -1) {
                        matriz[index1][index2] = 1;
                        matriz[index2][index1] = 1;
                }
            }
            
            }
            
            
            for (int i = 0; i < userCount; i++) {
                for (int j = 0; j < userCount; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
                
            }
            
        reader.close();
 
        fr.close();
            
            
        }catch (Exception err) {
            err.printStackTrace();
        }
    }
    
    public int getIndex(String[] lista_usuarios, int userCount, String vertex) {
    for (int i = 0; i < userCount; i++) {
        if (lista_usuarios[i].equals(vertex)) {
            return i;
        }
    }
    return -1;
    }
   
   
}



   


        
