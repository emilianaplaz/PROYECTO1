/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static proyecto.pkg1.MatrizAdyacencia.file;

/**
 *
 * @author emilianaplaz
 * Clase que contiene todas las funciones que se pueden realizar sobre la lista de usuarios y sus relaciones
 */
public class FuncionesGrafo {
    
    //Declarar atributos
    public static boolean usuarioExistente;
    public static boolean relacionExistente;
    
    
    //Método para agregar un usuario al archivo
    public void agregar_usuario(String nuevo_usuario){
        String usuario_nuevo = "@" + nuevo_usuario;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line;
            usuarioExistente=false;
            
            //Validar si el usuario ya existe
            while ((line = br.readLine()) != null) {
                if (line.equals(usuario_nuevo)){
                    usuarioExistente=true;
                }
            }
            
            br.close();
        //Si no existe, comenzar el método para agregarlo    
        if (!usuarioExistente) {
               fr = new FileReader(file);
               br = new BufferedReader(fr);
               
               //Agregar el nuevo usuario debajo de la línea "usuarios"
               while ((line = br.readLine()) != null) {
                   sb.append(line).append("\n");
                   if (line.equals("usuarios")) {
                       sb.append(usuario_nuevo).append("\n");
                   }
               }

               br.close();

               File temporalFile = new File(file + ".tmp");
               FileWriter fw = new FileWriter(temporalFile);
               BufferedWriter writer = new BufferedWriter(fw);

               writer.write(sb.toString());

               writer.close();
               fw.close();

               File originalFile = new File(file);
               originalFile.delete();
               temporalFile.renameTo(originalFile);
           }
        
        
       } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }
    
    //Método para agregar una nueva relación
    public void agregar_relacion(String usuario1, String usuario2){
        String relacion1 = usuario1;
        String relacion2 = usuario2;
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            relacionExistente = false;
            String line;

            while ((line = br.readLine()) != null) {
                    if (line.equals(relacion1+","+relacion2)){
                        relacionExistente=true;
                    }
                }

                br.close();

            if (!relacionExistente){

                fr = new FileReader(file);
                br = new BufferedReader(fr);

                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                    if(line.equals("relaciones")){
                        sb.append(relacion1);
                        sb.append(",");
                        sb.append(relacion2);
                        sb.append("\n");
                    }
                }
                br.close();

                File temporalFile = new File(file + ".tmp");
                FileWriter fw = new FileWriter(temporalFile);
                BufferedWriter writer = new BufferedWriter(fw);

                writer.write(sb.toString());

                writer.close();
                fw.close();
                
                

                File originalFile = new File(file);
                originalFile.delete();
                temporalFile.renameTo(originalFile);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    
        
    //Método para eliminar un usuario y todas sus relaciones en el txt
    public void eliminar_usuario(String eliminado_usuario){
        String usuario_eliminado = eliminado_usuario;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line;
            usuarioExistente=false;
            
            while ((line = br.readLine()) != null) {
                if (line.equals(usuario_eliminado)){
                    usuarioExistente=true;
                }
            }            
            br.close();
            
            
            if(usuarioExistente){
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                
                while((line = br.readLine()) != null) {
                if(!line.contains(usuario_eliminado)){
                   sb.append(line).append("\n"); 
                    }
                }
                br.close();


                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print(sb.toString());
                pw.close();
                bw.close();
                fw.close();
                }
            
            
        }catch(Exception err){
        
        }
    }
    
    //Método para eliminar una relación existente
    public void eliminar_relacion(String usuario1,String usuario2){
        String relacion1 = usuario1;
        String relacion2 = usuario2;
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            relacionExistente = false;
            String line;

            while ((line = br.readLine()) != null) {
                    if (line.equals(relacion1+","+relacion2)){
                        relacionExistente=true;
                    }
                }

                br.close();


            if (relacionExistente){
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                
                while((line = br.readLine()) != null) {
                if(!line.equals(usuario1+","+usuario2)){
                   sb.append(line).append("\n"); 
                    }
                }
                br.close();


                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print(sb.toString());
                pw.close();
                bw.close();
                fw.close();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
   
    }

