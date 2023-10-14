/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author emilianaplaz
 */
public class NodoUsuario {
    private String usuarios;
    private NodoUsuario pNext;

    public NodoUsuario(String usuarios) {
        this.usuarios = usuarios;
        this.pNext = null; 
    }

    public String getUsuarios() {
        return usuarios;
    }


    public NodoUsuario getpNext() {
        return pNext;
    }

    public void setUsuario(String usuarios) {
        this.usuarios = usuarios;
    }

    public void setpNext(NodoUsuario pNext) {
        this.pNext = pNext;
    }

    
    
    
    
    
}
