package pr2.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Graph<V>{
//Lista de adyacencia.
private Map<V, Set<V>> adjacencyList = new HashMap<>();
/******************************************************************
* Añade el vértice ‘v‘ al grafo.
*
* @param v vértice a añadir.
* @return ‘true‘ si no estaba anteriormente y ‘false‘ en caso
* contrario.
******************************************************************/
public boolean addVertex(V v){
    if(adjacencyList.containsKey(v)){
        return false; //existía anteriormente
    }
    else{adjacencyList.put(v,new TreeSet<V>());
        return true; //no estaba anteriormente
    }
}
    /******************************************************************
    * Añade un arco entre los vértices ‘v1‘ y ‘v2‘ al grafo. En
    * caso de que no exista alguno de los vértices, lo añade
    * también.
    *
    * @param v1 el origen del arco.
    * @param v2 el destino del arco.
    * @return ‘true‘ si no existía el arco y ‘false‘ en caso
    contrario.
    ******************************************************************/
public boolean addEdge(V v1, V v2){
    if(adjacencyList.containsKey(v1) && adjacencyList.containsKey(v2)){
        Set<V> theEdgesFromV1 = adjacencyList.get(v1);
        if(!theEdgesFromV1.contains(v2)){
            theEdgesFromV1.add(v2);
            return true;
        }
        else return false;
    }
    else{
        return false;
    }
}
    /******************************************************************
    * Obtiene el conjunto de vértices adyacentes a ‘v‘.
    *
    * @param v vértice del que se obtienen los adyacentes.
    * @return conjunto de vértices adyacentes.
    ******************************************************************/
public Set<V> obtainAdjacents(V v) throws Exception{
    if (adjacencyList.containsKey(v)){
        return adjacencyList.get(v);
    }else
        throw new Exception("Vértice no existe"); //Este código hay que modificarlo.
    }
    /******************************************************************
    * Comprueba si el grafo contiene el vértice dado.
    *
    * @param v vértice para el que se realiza la comprobación.
    * @return ‘true‘ si ‘v‘ es un vértice del grafo.
    ******************************************************************/
public boolean containsVertex(V v){
        if(this.adjacencyList.containsKey(v)){
            return true;
        }else{
            return false;}
     //Este código hay que modificarlo.
    }
    /******************************************************************
    * Método ‘toString()‘ reescrito para la clase ‘Grafo.java‘.
    * @return una cadena de caracteres con la lista de adyacencia
    .
    ******************************************************************/

@Override
public String toString(){
    StringBuilder mycode = new StringBuilder("Vertice\t Conexiones\n");
    for (V vertice : this.adjacencyList.keySet()){
        mycode.append(vertice.toString());
        mycode.append(adjacencyList.get(vertice).toString() + "\n");
    }
    return mycode.toString();
}
/******************************************************************
* Obtiene, en caso de que exista, un camino entre ‘v1‘ y ‘v2
‘. En
* caso contrario, devuelve ‘null‘.
*
* @param v1 el vértice origen.
* @param v2 el vértice destino.
* @return lista con la secuencia de vértices desde ‘v1‘ hasta
‘v2‘
* pasando por arcos del grafo.
******************************************************************/
public List<V> onePath(V v1, V v2){
    List<V> trazaList = new ArrayList<>();
    Stack<V> abierta = new Stack<>();
    abierta.push(v1);
    boolean encontrado = false;
    while (!abierta.empty() && !encontrado) {
        V vertexTraveler = abierta.pop();
        trazaList.add(vertexTraveler);
        if(vertexTraveler.equals(v2)){
            encontrado = true;
        }else{
            for (V adjacentsV : this.adjacencyList.get(vertexTraveler)){
                abierta.push(adjacentsV);
            }                    
        }
        if(encontrado) return trazaList;
    }
    return null;
    }
}
/*
V verticeAdjacente = mipila.pop();
el while lo itera hasta que lo encuentre y la pila no este vacia 
el pop es lo que hace viajar en el grafo
si hago pop en 3 ire al numero 3

cuando ese pop esta viajando a un nuevo vertice o a un conocido

si visita a uno ya conocido estas dando marcha atras usarias remove -1 es decir el uktimo elemento
si es false el elmento es nuevo traza.add

camino del 1 al 4 meto en la pila los element en orden creciente
vaijo del 1 al 2
pop del 1, 1 es = 4, no.
apilas los adyacentes de 4 (2,3)

pop del 2 es nuevo asi que traza.add
2 no es igual a 4 asi que adyacentes de 2 (1)
1 ya es visitado

por lo que eliminas 2 de la traza y haces pop de 3 para meterlo en traza.add
al hacer pop .
*/
