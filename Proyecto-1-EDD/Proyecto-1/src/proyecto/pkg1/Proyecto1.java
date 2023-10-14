/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;

import GUI.MenuPrincipal;
import java.awt.Desktop;
import java.io.File;
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
        
        FuncionesListaUsuarios funciones_usuarios=new FuncionesListaUsuarios();
        ListaUsuarios lista_usuarios=new ListaUsuarios();
        lista_usuarios.AgregarFinal("@Amelia");
        lista_usuarios.AgregarFinal("@Carlos");
        lista_usuarios.AgregarFinal("@Ana");
        lista_usuarios.AgregarFinal("@Pedro");
        funciones_usuarios.escribir_txt(lista_usuarios);
        
        ListaUsuarios usuarios2;
        usuarios2=funciones_usuarios.leer_txt();
        ///usuarios2.mostrar_elementos();
        
        System.out.println(OpenFile());
        
        
        
    }
    
    public static boolean OpenFile(){
        try{
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto","txt");
            fileChooser.setFileFilter(filter);
            fileChooser.setCurrentDirectory(new File("."));
            int result = fileChooser.showOpenDialog(null);
            System.out.println("Resultado"+ result);
            
            if (result == JFileChooser.APPROVE_OPTION){
                File chosenFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("Filepath"+chosenFile);
                
                if(!Desktop.isDesktopSupported()){
                    System.out.println("No se puede abrir");
                    return false;
                }else{
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(chosenFile);
                    return true;
                }
            }else if(result == JFileChooser.CANCEL_OPTION){
                System.out.println("Cancelado");
                return false;
            }
            
               
               
        }catch(Exception err){
            System.out.println(err);
            return false; 
        }
        return false;
    }
    
}


