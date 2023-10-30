/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxGraphLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import static proyecto.pkg1.Grafo.grafo;
import static proyecto.pkg1.MatrizAdyacencia.matriz;

/**
 *
 * @author emilianaplaz
 * Clase para conseguir los coponentes fuertemente conectados 
 */
public class ComponentesConectados {

    public int[][] conseguirComponentes() {
        int n = matriz.length;
        boolean[] visitado = new boolean[n];
        int[] orden = new int[n];
        int index = 0;

        // Recorrido DFS en el grafo original
        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                index = dfs(i, visitado, orden, index);
            }
        }

        // Crear grafo transpuesto
        int[][] matrizTranspuesta = getTranspuesta();

        // Realizar DFS en grafo transpuesto
        visitado = new boolean[n];
        int[][] componentesConectados = new int[n][];

        for (int i = n - 1; i >= 0; i--) {
            int v = orden[i];

            if (!visitado[v]) {
                int size = dfs(matrizTranspuesta, v, visitado, componentesConectados);
                componentesConectados[v] = new int[size];
            }
        }

        return componentesConectados;
    }

    private int dfs(int v, boolean[] visitado, int[] orden, int index) {
        visitado[v] = true;

        for (int vecino = 0; vecino < matriz.length; vecino++) {
            if (matriz[v][vecino] == 1 && !visitado[vecino]) {
                index = dfs(vecino, visitado, orden, index);
            }
        }

        orden[index++] = v;
        return index;
    }

    private int[][] getTranspuesta() {
        int n = matriz.length;
        int[][] matrizTranspuesta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    private int dfs(int[][] grafo, int v, boolean[] visitado, int[][] componentesConectados) {
        visitado[v] = true;

        int size = 1;
        componentesConectados[v] = new int[size];

        for (int vecino = 0; vecino < grafo.length; vecino++) {
            if (grafo[v][vecino] == 1 && !visitado[vecino]) {
                size += dfs(grafo, vecino, visitado, componentesConectados);
            }
        }

        componentesConectados[v] = new int[size];
        return size;
    }

    public void display() {
        int[][] componentes = conseguirComponentes();
        int componentCount = componentes.length;

        // Generar colores
        String[] colores = generarColores(componentCount);

        Object parent = grafo.getDefaultParent();
        mxGraphLayout layout = new mxCircleLayout(grafo);
        layout.execute(parent);

        grafo.getModel().beginUpdate();
        try {
            // Crear celdas para cada componente y darle un color
            for (int i = 0; i < componentCount; i++) {
                int[] component = componentes[i];
                int vertexCount = component.length;

                for (int j = 0; j < vertexCount; j++) {
                    // Crear un vértice para cada componente
                    Object vertice = grafo.insertVertex(parent, null, Integer.toString(component[j]), 20, 20, 80, 30);

                    
                    grafo.setCellStyles(mxConstants.STYLE_FILLCOLOR, colores[i], new Object[]{vertice});
                }
            }
        } finally {
            grafo.getModel().endUpdate();
        }

        // Crear el componente grafo y agregarlo al frame
        mxGraphComponent graphComponent = new mxGraphComponent(grafo);
        
    }

    private String[] generarColores(int n) {
        String[] colores = new String[n];

        for (int i = 0; i < n; i++) {
            // Crear colores aleatorios en forma hexadecimal
            String color = "#" + Integer.toHexString((int) (Math.random() * 0xFFFFFF));
            colores[i] = color;
        }

        return colores;
    }
}

             

