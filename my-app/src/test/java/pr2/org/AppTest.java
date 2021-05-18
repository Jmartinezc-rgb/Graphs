/*Copyright 2021 Javier Martínez Cristóbal
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/
package pr2.org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AppTest{
    Graph<Integer> myGraph;
    Graph<Integer> myEdge;

    @Before
    public void setup(){
        myGraph = new Graph<Integer>();
        myEdge = new Graph<Integer>();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    //primer test existe mi grafo
    @Test
    public void myGraphExists(){
        assertNotNull(myGraph);
    }
    //test vacío de toString
    @Test
    public void firstToStringTest() {
        String expectedOutput = "Vertice\t Conexiones\n";
        assertEquals(expectedOutput + "", myGraph.toString());
    }
    //test para añadir un vértice
    @Test
    public void addVertexOk(){
        assertTrue(myGraph.addVertex(1));
        assertTrue(myGraph.addVertex(2));
    }
    //test para impedir la repetición de vértices
    @Test
    public void addVertexFail(){
        assertTrue(myGraph.addVertex(1));
        assertFalse(myGraph.addVertex(1));
    }
    //primer test de edge
    @Test
    public void myEdgeExists(){
        assertNotNull(myEdge);
    }
    //test para añadir un arista (edge) entre dos vértices
    @Test
    public void addEdgeOk(){
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        assertTrue(myGraph.addEdge(1 , 2));
    }
    //test para impedir la repetición de aristas (edges)
    @Test
    public void addEdgeFail(){
        assertFalse(myEdge.addEdge(1 ,2));
    }
    //test para obligar que obtainAdjacents lanze(throw) una expección 
    @Test (expected = Exception.class)
    public void obtainAdjacentsFailAndException() throws Exception {
        this.myGraph.obtainAdjacents(1);
    }
    //Tests anteriores pero con expectedOutput 
    @Test
    public void addVertexOktoString(){
        String expectedOutput = "Vertice\t Conexiones\n";
        assertTrue(myGraph.addVertex(1));
        assertEquals(expectedOutput + "1[]\n"
        , myGraph.toString());
    }

    @Test   
    public void addVertexFailtoString(){
        String expectedOutput = "Vertice\t Conexiones\n";
        assertTrue(myGraph.addVertex(1));
        assertFalse(myGraph.addVertex(1));
        assertEquals(expectedOutput 
        + "1[]\n", myGraph.toString());
    }

    @Test
    public void addEdgeOktoString(){
        String expectedOutput = "Vertice\t Conexiones\n";
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        assertTrue(myGraph.addEdge(1 , 2));
        assertEquals(expectedOutput 
            + "1[2]\n"
            + "2[]\n", myGraph.toString());
    }

    @Test
    public void addEdgeFailtoString(){
        String expectedOutput = "Vertice\t Conexiones\n";
        assertFalse(myEdge.addEdge(1 ,2));
        assertEquals(expectedOutput, myEdge.toString());
    }
    /**
    * Este test comprueba que el método ‘onePath(V v1, V v2)‘
    * encuentra un camino entre ‘v1‘ y ‘v2‘ cuando existe.
    */
    @Test
    public void onePathFindsAPath(){
    System.out.println("\nTest onePathFindsAPath");
    System.out.println("----------------------");
    // Se construye el grafo.
    Graph<Integer> g = new Graph<>();
    g.addVertex(1);
    g.addVertex(2);
    g.addVertex(3);
    g.addVertex(4);
    g.addVertex(5);
    g.addVertex(6);

    g.addEdge(1, 2);
    g.addEdge(3, 4);
    g.addEdge(1, 5);
    g.addEdge(5, 6);
    g.addEdge(6, 4);
    // Se construye el camino esperado.
    List<Integer> expectedPath = new ArrayList<>();
    expectedPath.add(1);
    expectedPath.add(5);
    expectedPath.add(6);
    expectedPath.add(4);
    //Se comprueba si el camino devuelto es igual al esperado.
    assertEquals(expectedPath, g.onePath(1, 4));
    }
}




