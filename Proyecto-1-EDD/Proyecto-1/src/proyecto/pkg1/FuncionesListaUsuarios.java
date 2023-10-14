/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane; 

/**
 *
 * @author emilianaplaz
 */
public class FuncionesListaUsuarios {
    
    public void escribir_txt(ListaUsuarios usuarios){
        String usuarios_actuales="";
        if (usuarios.isEmpty()){
            NodoUsuario temp;
            temp=usuarios.getInicio();
            for (int i=0; i<usuarios.getSize();i++){
                usuarios_actuales += temp.getUsuarios();
                temp=temp.getpNext();
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test//usuarios.txt");
            pw.print(usuarios_actuales);            
            pw.append("@emiliana");
            pw.append("\n");
            pw.append("@andres");
            pw.append("\n");
            pw.append("@jose");
            pw.append("\n");
            pw.append("@ana");
            pw.close();
            JOptionPane.showMessageDialog(null,"guardado exitoso");
            
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    public ListaUsuarios leer_txt(){
        ListaUsuarios usuarios = new ListaUsuarios();
        String line;
        String usuarios_txt="";
        String path="test//usuarios.txt";
        File file=new File(path);
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr =new FileReader(file);
                BufferedReader br=new BufferedReader(fr);
                while((line=br.readLine()) !=null){
                    if(!line.isEmpty()){
                        usuarios_txt += line + "\n"; 
                    }
                }
                if (!"".equals(usuarios_txt )){
                    String[] usuarios_split=usuarios_txt.split("\n");
                    for (int i=0; i<usuarios_split.length; i++){
                        String[] usuario=usuarios_split[i].split(",");
                        usuarios.AgregarFinal(usuario[0]);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null,"lectura exitosa");
            }
                    
                    
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"error");
             
        }
        return usuarios;

    }
}
