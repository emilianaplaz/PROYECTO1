/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author emilianaplaz
 */
public class ListaUsuarios {
    private NodoUsuario inicio;
    private NodoUsuario fin;
    private int size;

    public ListaUsuarios() {
        inicio = null;
        fin = null;
        size = 0;
    }

    public boolean isEmpty(){
        return getInicio()==null;
    }
    
    public void AgregarInicio(String usuarios){
        NodoUsuario nuevo_usuario = new NodoUsuario(usuarios);
        
        if (isEmpty()){
            setInicio(nuevo_usuario);
            setFin(nuevo_usuario);                   
        }else{
            nuevo_usuario.setpNext(getInicio());
            setInicio(nuevo_usuario);
        }
        setSize(getSize()+1);
    }
    
    public void AgregarFinal(String usuarios){
        NodoUsuario nuevo_usuario = new NodoUsuario(usuarios);
        if(isEmpty()){
             AgregarInicio(usuarios);
        }else{
            getFin().setpNext(nuevo_usuario);
            setFin(nuevo_usuario);
        }
        setSize(getSize()+1);

    }
    
    public void vaciar(){
        setInicio(null);
        setFin(null);
        setSize(0);
    }
    
    public void mostrar_elementos(){
        String mostrar_lista="";
        if(isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vacía");                    
        }else{
            NodoUsuario temporal;
            temporal=getInicio();
            for(int i=0; i<getSize(); i++){
                mostrar_lista+= "Usuario:"+temporal.getUsuarios();
                temporal=temporal.getpNext();
            }
        }
    }
     
    
    public NodoUsuario getInicio() {
        return inicio;
    }

    public NodoUsuario getFin() {
        return fin;
    }

    public int getSize() {
        return size;
    }

    public void setInicio(NodoUsuario inicio) {
        this.inicio = inicio;
    }

    public void setFin(NodoUsuario fin) {
        this.fin = fin;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
            
            
    
}
