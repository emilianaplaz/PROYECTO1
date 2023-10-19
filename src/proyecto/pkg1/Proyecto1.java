/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;

import GUI.MenuPrincipal;
import java.io.IOException;
        

/**
 *
 * @author emilianaplaz
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    
    
        
    public static void main(String[] args) throws IOException {        
        MenuPrincipal menu_principal = new MenuPrincipal ();
        menu_principal.setVisible(true); 
                        
        //GrafoMatrizAdyacencia matriz = new GrafoMatrizAdyacencia(5);
       
        //matriz.imprimir_matriz();
        
        ListaUsuarios lista_usuarios = new ListaUsuarios();
        FuncionesListaUsuarios crear_lista_usuarios=new FuncionesListaUsuarios();
        crear_lista_usuarios.escribir_txt(lista_usuarios);
        
        

           
 
        
        
        //GrafoMatrizAdyacencia gf = new GrafoMatrizAdyacencia();
        //gf.crearMatrix();
        
        
    } 
        
        
        
        
        
        
    }
    

    
    
    
    
     
    




