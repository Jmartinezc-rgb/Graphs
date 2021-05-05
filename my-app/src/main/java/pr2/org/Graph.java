package pr2.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
        return false;//existía anteriormente
    }
    else{adjacencyList.put(v,new TreeSet<V>());
        return true;//no estaba anteriormente
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
    return true; //Este código hay que modificarlo.
    }
    /******************************************************************
    * Obtiene el conjunto de vértices adyacentes a ‘v‘.
    *
    * @param v vértice del que se obtienen los adyacentes.
    * @return conjunto de vértices adyacentes.
    ******************************************************************/
public Set<V> obtainAdjacents(V v) throws Exception{
    return null; //Este código hay que modificarlo.
    }
    /******************************************************************
    * Comprueba si el grafo contiene el vértice dado.
    *
    * @param v vértice para el que se realiza la comprobación.
    * @return ‘true‘ si ‘v‘ es un vértice del grafo.
    ******************************************************************/
public boolean containsVertex(V v){
    return true; //Este código hay que modificarlo.
    }
    /******************************************************************
    * Método ‘toString()‘ reescrito para la clase ‘Grafo.java‘.
    * @return una cadena de caracteres con la lista de adyacencia
    .
    ******************************************************************/
@Override
public String toString(){
return ""; //Este código hay que modificarlo.
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
return null; //Este código hay que modificarlo.
}
}