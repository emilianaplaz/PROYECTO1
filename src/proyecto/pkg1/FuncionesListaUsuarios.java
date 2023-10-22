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
import javax.swing.JOptionPane; 

/**
 *
 * @author emilianaplaz
 */
public class FuncionesListaUsuarios {

    public FuncionesListaUsuarios() {
    }
    
    public void escribir_txt(ListaUsuarios usuarios){
        String usuarios_actuales="";
        if (usuarios.isEmpty()){
            NodoUsuario temp;
            temp=usuarios.getInicio();
            for (int i=0; i<usuarios.getSize();i++){
                usuarios_actuales += temp.getUsuarios() + "\n";
                temp=temp.getpNext();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter("test//usuarios.txt");
            PrintWriter pw = new PrintWriter(fileWriter);
            pw.print(usuarios_actuales); 
            pw.append("usuarios:");
            pw.append("\n");
            pw.append("@emiliana\n");
            pw.append("@andres\n");
            pw.append("@jose\n");
            pw.append("@ana\n");
            pw.append("@sofia\n");
            pw.append("@laura\n");
            pw.append("@miranda\n");
            pw.append("relaciones:");
            pw.append("\n");
            pw.append("@emiliana,@andres\n");
            pw.append("@jose,@ana\n");
            pw.append("@sofia,@laura\n");
            pw.append("@sofia,@miranda\n");
            pw.append("@jose,@emiliana");
            pw.close();
            
            
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    

    public void eliminar_usuario(MatrizAdyacencia matriz, String eliminado_usuario){
        String usuario_eliminado = "@"+eliminado_usuario;
        String file="test/usuarios.txt";

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line;
            
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
            
        }catch(Exception err){
        
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
            }
                    
                    
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"error");
             
        }
        return usuarios;

    }
}
    
    
