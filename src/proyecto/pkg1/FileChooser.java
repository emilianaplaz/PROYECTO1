/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author emilianaplaz
 */
public class FileChooser {
    
    public static boolean open_file() {
        try{
            JFileChooser file_chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto","txt");
            file_chooser.setFileFilter(filter);
            
            file_chooser.setCurrentDirectory(new File("Proyecto-1"));
            int result = file_chooser.showOpenDialog(null);
            System.out.println("Resultado"+result);
            
            if(result ==JFileChooser.APPROVE_OPTION){
                File file_seleccionado = new File(file_chooser.getSelectedFile().getAbsolutePath());
                System.out.println("Filepath" + file_seleccionado);
                
                
                if(!Desktop.isDesktopSupported()){
                    System.out.println("No se puede abrir");
                    return false;
                }else{
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(file_seleccionado);
                    return true;
                }    
            }else if (result == JFileChooser.CANCEL_OPTION){
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
