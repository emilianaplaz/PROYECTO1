/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author emilianaplaz
 */
public class GrafoMatrizAdyacencia{
    private int [][] matriz;
    
    public GrafoMatrizAdyacencia(int size){
        matriz=new int [size][size];
        
    }
    
    public void agregar_usuario(NodoMatriz usuario){
        
    }
    
    public void agregar_conexion(int origen, int destino){
        matriz [origen][destino]=1;
    }
    
    public boolean check_conexion(int origen, int destino){
        if (matriz[origen][destino]==1){
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimir_matriz(){
        for(int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
        System.out.println();
        }
    }
}
