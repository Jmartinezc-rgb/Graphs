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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * La clase Graph contiene los distintos métodos necesarios para
 * crear un grafo. Desarrollado a través de TDD en la clase AppTest
 * 
 * @author Javier Martinez Cristobal
 * @version 18/05/2021
 * 
 */

public class Graph<V>{
//Lista de adyacencia.
private Map<V, Set<V>> adjacencyList = new HashMap<>();
/******************************************************************
* Añade el vértice ‘v‘ al grafo.
* //Complejidad espacial O(1) constante
* //Complejidad temporal O(1) constante
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
    * //Complejidad espacial O(1) constante
    * //Complejidad temporal O(1) constante
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
    * //Complejidad espacial O(1) constante
    * //Complejidad temporal O(1) constante
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
    * //Complejidad espacial O(1) constante
    * //Complejidad temporal O(1)constante
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
    * //Complejidad espacial O(1) constante
    * //Complejidad temporal O(n) lineal
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
* //Complejidad espacial O(1) constante
* //Complejidad temporal O(n^2) cuadrática
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