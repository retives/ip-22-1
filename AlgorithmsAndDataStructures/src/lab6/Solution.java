package lab6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Unoriented graph\n");

        Graph graph = new Graph(7, 12);
        graph.addVertex('a'); //0
        graph.addVertex('b'); //1
        graph.addVertex('c'); //2
        graph.addVertex('d'); //3
        graph.addVertex('e'); //4
        graph.addVertex('f'); //5
        graph.addVertex('g'); //6

        graph.addEdge(0, 1);
        graph.addEdge(0, 1);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4 , 5);

        System.out.println("Adjacency matrix");
        graph.printAdjMatrix();

        System.out.println("Incedence matrix");
        graph.printIncMatrix();

        System.out.println("Edge list");
        graph.printEdgesList();

        System.out.println("Adjacency list");
        graph.printAdjList();

        System.out.println("\n\nOriented graph\n");

        OrientedGraph orGraph = new OrientedGraph(6, 11);
        orGraph.addVertex('a'); //0
        orGraph.addVertex('b'); //1
        orGraph.addVertex('c'); //2
        orGraph.addVertex('d'); //3
        orGraph.addVertex('f'); //5
        orGraph.addVertex('g'); //6

        orGraph.addEdge(0, 1);
        orGraph.addEdge(0, 2);
        orGraph.addEdge(1, 0);
        orGraph.addEdge(2, 0);
        orGraph.addEdge(1, 3);
        orGraph.addEdge(3, 1);
        orGraph.addEdge(3, 4);
        orGraph.addEdge(3, 5);
        orGraph.addEdge(2, 4);
        orGraph.addEdge(2, 5);
        orGraph.addEdge(4, 5);


        System.out.println("Adjacency matrix");
        orGraph.printAdjMatrix();

        System.out.println("Incedence matrix");
        orGraph.printIncMatrix();

        System.out.println("Edge list");
        orGraph.printEdgesList();

        System.out.println("Adjacency list");
        orGraph.printAdjList();


        ///за матрицею суміжності побудувати матрицю інцидентності

        System.out.println("\n\nEnter the vertecies amount: ");
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        System.out.println("\n\nEnter the amount of edges: ");
        int e = s.nextInt();
        Graph graph2 = new Graph(v,e);
        graph2.createIncUsingAdj();
        graph2.printAdjMatrix();
        System.out.println("Incidence matrix:");
        graph2.printIncMatrix();

        ///за матрицею суміжності побудувати список суміжності
        System.out.println("\n\nEnter the vertecies amount: ");
        v = s.nextInt();
        Graph graph3 = new Graph(v,e);
        graph3.createAdjListUsingAdjM();
        System.out.println("Adjacency list");
        graph3.printAdjList();

        //за аматрицую суміжності побудувати список ребер
        System.out.println("\n\nEnter the vertecies amount: ");
        int v2 = s.nextInt();
        System.out.println("\n\nEnter the amount of edges: ");
        int e2 = s.nextInt();
        Graph graph4 = new Graph(v2,e2);
        graph4.createIncUsingAdj();
        System.out.println("List of edges");
        graph4.printEdgesListWithoutL();
        s.close();
    }
}