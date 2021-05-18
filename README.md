# GRAPHS #

En matemáticas y ciencias de la computación, un grafo (del griego grafos)​ es un conjunto de objetos llamados vértices o nodos unidos por enlaces llamados aristas o arcos, que permiten representar relaciones binarias entre elementos de un conjunto.

Típicamente, un grafo se representa gráficamente como un conjunto de puntos (vértices o nodos) unidos por líneas (aristas).

Desde un punto de vista práctico, los grafos permiten estudiar las interrelaciones entre unidades que interactúan unas con otras. Por ejemplo, una red de computadoras puede representarse y estudiarse mediante un grafo, en el cual los vértices representan terminales y las aristas representan conexiones (las cuales, a su vez, pueden ser cables o conexiones inalámbricas).

*Fuente:https://es.wikipedia.org/wiki/Grafo

## DESCRIPCIÓN ##
En esta práctica utilizaremos algo parecido al algoritmo de caminos mínimos.
El Algortimo de Dijkstra, también denominado Algoritmo de caminos mínimos, es un modelo que se clasifica dentro de los algoritmos de búsqueda. Su objetivo, es determinar la ruta más corta, desde el nodo origen, hasta cualquier nodo de la red. Su metodología se basa en iteraciones, de manera tal que en la práctica, su desarrollo se dificulta a medida que el tamaño de la red aumenta, dejándolo en clara desventaja, frente a métodos de optimización basados en programación matemática.
*Fuente:https://www.ingenieriaindustrialonline.com/investigacion-de-operaciones/algoritmo-de-dijkstra/

![Alt text](https://4.bp.blogspot.com/-W7l7-YMEmLg/WfJ1SO_02_I/AAAAAAAAB7k/gW-QVpN-yWcwyYeR5mnKE53S-4E2KYJ2ACLcBGAs/s1600/giphy.gif)

## COMANDOS ##
Se utilizarán los siguientes comandos :page_facing_up:

-:one:mvn test: para el desarrollo guiado por pruebas [TDD](https://es.wikipedia.org/wiki/Desarrollo_guiado_por_pruebas#:~:text=Desarrollo%20guiado%20por%20pruebas%20de%20software%2C%20o%20Test%2Ddriven%20development,)(click en TDD para saber lo que es)

-:two:mvn compile: para compilar el proyecto

-:three:mvn clean: para hacer clean del proyeto maven eliminando la carpeta target

-:four:mvn clean compile assembly:single: para general el archivo .jar
-:five:mvn site: para generar el javadoc

## REQUISITOS ##
Para la utilización de este repositorio se necesitará:mag:
 
-:green_book:[Maven](https://maven.apache.org/).
[Aquí](https://myhanoli.com/2018/06/23/comoinstalarmavenenwindows/) una guía de como instalarlo o una guía formato video haz click [aquí](https://www.youtube.com/watch?v=snp1dTlJxqw&ab_channel=MitoCode).

-:blue_book:[Java](https://www.java.com/es/download/ie_manual.jsp) una guía de como instalarlo o una guía formato video haz [aquí](https://www.youtube.com/watch?v=s2YkWxVo49o&ab_channel=programadornovato)

-:orange_book:[JDK](https://www.youtube.com/watch?v=Stx3MNV3AHE&ab_channel=programadornovato) ver el vido para instalar el JDK.