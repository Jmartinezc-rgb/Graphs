package pr2.org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
    //primer test

    @Test
    public void myGraphExists(){
        assertNotNull(myGraph);
    }

    @Test
    public void addVertexOk(){
        assertTrue(myGraph.addVertex(1));
        assertTrue(myGraph.addVertex(2));
    }

    @Test
    public void addVertexFail(){
        assertTrue(myGraph.addVertex(1));
        assertFalse(myGraph.addVertex(1));
    }

    @Test
    public void myEdgeExists(){
        assertNotNull(myEdge);
    }

    @Test
    public void addEdgeOk(){
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        assertTrue(myGraph.addEdge(1 , 2));
    }

    @Test
    public void addEdgeFail(){
        assertFalse(myEdge.addEdge(1 ,2));
    }

    @Test (expected = Exception.class)
    public void obtainAdjacentsFailAndException() throws Exception {
        this.myGraph.obtainAdjacents(1);
    }


    @Test
    public void firstToStringTest() {
        String expectedOutput = "Vertice\t Conexiones\n";
        assertEquals(expectedOutput, myGraph.toString());
    }
    
}




/**
* Este test comprueba que el método ‘onePath(V v1, V v2)‘
* encuentra un camino entre ‘v1‘ y ‘v2‘ cuando existe.
*/
/*@Test
public void onePathFindsAPath(){
System.out.println("\nTest onePathFindsAPath");
System.out.println("----------------------");
// Se construye el grafo.
Graph<Integer> g = new Graph<>();
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
}*/
