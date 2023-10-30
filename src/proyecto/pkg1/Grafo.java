/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.mxParallelEdgeLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static proyecto.pkg1.MatrizAdyacencia.lista_usuarios;
import static proyecto.pkg1.MatrizAdyacencia.matriz;

/**
 *
 * @author emilianaplaz
 * Clase para la creación del grafo a partir de la matriz de adyacencia creada en la clase MatrizAdyacencia
 */
public class Grafo {
    
    //Declarar atributos
    public static mxGraph grafo;
    
    //Método para la creación del grafo 
    public void crear_grafo(){
            //Crear nuevo objeto de mxGraph
            grafo = new mxGraph();
            
            //Crear celda padre
            Object parent = grafo.getDefaultParent();
            JFrame frame = new JFrame("Grafo");
            Container contentPane = frame.getContentPane();
            
            //Crear vertices basados en la matriz
            Object[] vertices = new Object[matriz.length];
            //Recorrer la lista de usuarios y crear la cantidad de vértices necesarios
            for (int i = 0; i < matriz.length; i++) {
                String usuario = lista_usuarios[i];
                vertices[i] = grafo.insertVertex(parent, null, usuario, 20, 20, 80, 30, "shape=ellipse");
            }
            
            //Crear aristas basadas en la matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == 1) {
                        Object edge = grafo.insertEdge(parent, null, "", vertices[i], vertices[j]);
                        grafo.setCellStyle("endArrow=classic", new Object[] { edge });
                    }
                }
            }
           
            mxHierarchicalLayout layout = new mxHierarchicalLayout(grafo);
            layout.execute(parent);
            mxParallelEdgeLayout parallelLayout = new mxParallelEdgeLayout(grafo);
            parallelLayout.execute(parent);

            // Crear un nuevo componente de agregarlo al frame
            mxGraphComponent graphComponent = new mxGraphComponent(grafo);
            contentPane.add(graphComponent);
            
            //Agregar botón para cerrar la ventana del grafo
            JButton cerrar = new JButton("Cerrar ventana");
            cerrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); 
                }
            });
            
            contentPane.add(cerrar, BorderLayout.SOUTH); 

            // Propiedades del frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 320);
            frame.setVisible(true);
    }
}
