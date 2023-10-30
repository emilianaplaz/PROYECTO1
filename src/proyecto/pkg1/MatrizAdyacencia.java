/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;





/**
 *
 * @author emilianaplaz
 * Clase para la creación de un matriz de adyacencia leyendo los datos del archivo de texto
 */
public class MatrizAdyacencia {
    
    //Declaración de los atributos
    public static String file;
    private File selectedFile;
    public static int userCount;
    public static String[] lista_usuarios;
    public static int[][] matriz;
    
    
    
    //Método para seleciconar un txt y retornar una variable de tipo String con la ruta del archivo 
    public String selectFile(){
        
         JFileChooser fileChooser = new JFileChooser();
        //Sólo permitir la escogencia de archivos txt
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt")); 
        
        int result = fileChooser.showOpenDialog(null);
        
        //asignar el valor de el archivo seleccionado a la variable "file"
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            file= selectedFile.getAbsolutePath();            
            
        //Validar que el programa no continúe si el usuario selecciona CANCELAR
        } else if (result == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un archivo para iniciar el programa");  
                System.exit(0);
            }
        
        return null;
    }
    
    //Método para la creación de la matriz de adyacencia
    public void crear_matriz() {
            //Leer el txt y contar el número de usuarios
            try {
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line;
                userCount = 0;
                
                //validación para que sólo lea los usuarios
                while ((line = reader.readLine()) != null) {
                if (line.equals("relaciones")) {
                    break;
                } else if (line.contains("@")) {
                    String user = line.trim().substring(1);
                    userCount++;
                }
            }

            //Contar el numero de relaciones            
            reader = new BufferedReader(fr);
            String line3;
            int relCount = 0;
            while ((line3 = reader.readLine()) != null) {
                if (line3.contains(",")) {
                    relCount++;
                }
            }
        
            
            // Crear un arreglo con todos los usuarios presentes
            lista_usuarios = new String[userCount];
            int index = 0;
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.equals("relaciones")) {
                    break;
                } else if (line.contains("@")) {
                    String user = line;
                    lista_usuarios[index] = user;
                    index++;
                }
            }
            

            //Inicializar la matriz
            matriz=new int [index][index];
            for (int i =0; i<index;i++){
                for(int j =0; j<index;j++){
                    matriz[i][j]= 0; 
                }
            }

            
            //Modificar la matriz dependiendo de las relaciones presentes
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
                        
                    }
                }
            }
            
            reader.close();
            fr.close();
    
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
        
   
    

    //Método para obtener el indice del usuario que se busca dentro del arreglo
    private int getIndex(String[] lista_usuarios, int userCount, String vertex) {
        for (int i = 0; i < userCount; i++) {
            if (lista_usuarios[i].equals(vertex)) {
                return i;
            }
        }
        return -1;
    }
    
    //Método para retornar la lista de usuarios
    public static String[] getUsuarios(){
        return lista_usuarios;
    }
    
    
    }


    

        
        