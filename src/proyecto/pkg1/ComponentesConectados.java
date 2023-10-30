/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import com.mxgraph.util.mxConstants;
import java.awt.Container;
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
        int[][] transposedMatriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatriz[j][i] = matriz[i][j];
            }
        }

        return transposedMatriz;
    }

    private int dfs(int[][] grafo, int v, boolean[] visitado, int[][] componentesConectados) {
        visitado[v] = true;

        int componentSize = 1;
        componentesConectados[v] = new int[componentSize];

        for (int neighbor = 0; neighbor < grafo.length; neighbor++) {
            if (grafo[v][neighbor] == 1 && !visitado[neighbor]) {
                componentSize += dfs(grafo, neighbor, visitado, componentesConectados);
            }
        }

        componentesConectados[v] = new int[componentSize];
        return componentSize;
    }

    public void display() {
        int[][] componentes = conseguirComponentes();
        int componentCount = componentes.length;

        // Generate colors
        String[] colores = generarColores(componentCount);

        Object parent = grafo.getDefaultParent();
        JFrame frame = new JFrame("Componentes fuertemente conectados");
        Container contentPane = frame.getContentPane();

        grafo.getModel().beginUpdate();
        try {
            // Create cells for each component and assign a color
            for (int i = 0; i < componentCount; i++) {
                int[] component = componentes[i];
                int vertexCount = component.length;

                for (int j = 0; j < vertexCount; j++) {
                    // Create a vertex for each component
                    Object[] vertices = new Object[component.length];
                    //vertices = grafo.insertVertex(parent, null, 20, 20, 80, 30);

                    // Set the vertex style to display the assigned color
                    grafo.setCellStyles(mxConstants.STYLE_FILLCOLOR, colores[i], new Object[]{vertices});
                }
            }
        } finally {
            grafo.getModel().endUpdate();
        }
    }

    private String[] generarColores(int n) {
        String[] colores = new String[n];

        for (int i = 0; i < n; i++) {
            // Generate random colors in hexadecimal format
            String color = String.format("#%06x", (int) (Math.random() * 0xFFFFFF));
            colores[i] = color;
        }

        return colores;
    }


}
