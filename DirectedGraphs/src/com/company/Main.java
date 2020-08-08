package com.company;


public class Main
{
    public static void main(String[] args)
    {
        DirectedGraph G = new DirectedGraph(12);
        G.addEdge(0, 1);
        G.addEdge(5, 0);
        G.addEdge(2, 0);
        G.addEdge(6, 0);
        G.addEdge(8, 7);
        G.addEdge(9, 10);
        G.addEdge(3, 4);
        G.addEdge(11, 9);
        G.addEdge(12, 9);
        G.addEdge(12, 10);

        //ConnectedComponents cc = new ConnectedComponents(G);
        System.out.println("The number of vertices = " + G.numberOfV());
        System.out.println("The number of edges = " + G.getE());
        //System.out.println("The number of connected components = " + cc.count());
    }
}
    /*
    Example:
        0--->1     7<---8  9---->10
       ^^^                ^ ^    ^
      / | \              /   \   |
      5 2 6             /     \  |
                       /       \ |
    3--->4            11------  12
    The number of vertices = 12
    The number of edges = 13
    The number of connected components = 3
     */

