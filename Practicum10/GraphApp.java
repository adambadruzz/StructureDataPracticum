package Practicum10;

public class GraphApp {

    public static void main(String[] args) {

        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(0, 2); // AB
        theGraph.addEdge(1, 0); // BC
        theGraph.addEdge(1, 4); // AD
        theGraph.addEdge(3, 4); // DE
        theGraph.addEdge(4, 2); // EC    
        theGraph.display();
        
        //theGraph.dfs();
        //theGraph.bfs();
        //theGraph.mst();
        
//        theGraph.Connectivity();
        
        //theGraph.addVertex('A'); //0
        //theGraph.addVertex('B'); //1
        //theGraph.addVertex('C'); //2
        //theGraph.addVertex('D'); //3
        //theGraph.addVertex('E'); //4
        //theGraph.addVertex('F'); //5
        //theGraph.addVertex('G'); //6
        //theGraph.addVertex('H'); //7
        
//        theGraph.addVertex(0, 3); // AD
//        theGraph.addVertex(0, 4); // AE
//        theGraph.addVertex(1, 4); // BE
//        theGraph.addVertex(3, 6); // DG
//        theGraph.addVertex(4, 6); // EG  
//        theGraph.addVertex(6, 7); // GH
//        theGraph.addVertex(2, 5); // CF
//        theGraph.addVertex(5, 7); // FH
//        theGraph.display();

    }
}

