/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;

import GUI.MenuPrincipal;
import proyecto.pkg1.GrafoMatriz;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
        

/**
 *
 * @author emilianaplaz
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    
    
        
    public static void main(String[] args) {        
        MenuPrincipal menu_principal = new MenuPrincipal ();
        menu_principal.setVisible(true); 
        
        int numVertices = 13;
        GrafoMatriz grafo = new GrafoMatriz(numVertices);

        grafo.cargar_datos("usuarios.txt");

        grafo.imprimir_matriz();
        
        
    } 
        
        
        //FuncionesListaUsuarios funciones_usuarios=new FuncionesListaUsuarios();
        //ListaUsuarios lista_usuarios=new ListaUsuarios();
        ///lista_usuarios.AgregarFinal("@Amelia");
        ///lista_usuarios.AgregarFinal("@Carlos");
        ///lista_usuarios.AgregarFinal("@Ana");
        //lista_usuarios.AgregarFinal("@Pedro");
        //funciones_usuarios.escribir_txt(lista_usuarios);
        
        //ListaUsuarios usuarios2;
        //usuarios2=funciones_usuarios.leer_txt();
        ///usuarios2.mostrar_elementos();
        
        //System.out.println(OpenFile());
        
        
        
    }
    

    
    
    
    
     
    




