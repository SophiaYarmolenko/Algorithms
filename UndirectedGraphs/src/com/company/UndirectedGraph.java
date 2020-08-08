package com.company;

import edu.princeton.cs.algs4.Bag;

//adjacency-list graph representation
public class UndirectedGraph
{
    private static int V;
    private static int E;
    private static Bag<Integer>[] adj;// adjacency list using Bag data type

    public UndirectedGraph(int V)
    {
        this.V = V+1;
        adj = (Bag <Integer> []) new Bag[V+1];//create empty graph with V vertices
        E = 0;
        for(int v = 0; v < V+1; v++)
            adj[v] = new Bag <Integer>();
    }

    public static int numberOfV()
    {
        return V - 1;
    }

    //return the number of vertices+1
    public static int getV()
    {
        return V;
    }

    //return the number of edges
    public static int getE()
    {
        return E;
    }

    //add edge v-w(parallel)
    public void addEdge (int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    //return all vertices that is connected with given
    public static Iterable<Integer> adj(int v)
    {
        return adj[v];
    }

    //return the degree of v
    public static int degree(int v)
    {
        int degree = 0;
        for(int w : adj(v))
            degree++;
        return degree;
    }

    //return the maximum degree
    public static int maxDegree()
    {
        int max = 0;
        for(int v = 0; v < getV(); v++)
            if(degree(v) > max)
                max = degree(v);
        return max;
    }

    // return the average degree
    public static double averageDegree()
    {
        return 2.0 * getE()/getV();
    }

    //return the number of self loops
    public static int NumberOfSelfLoops()
    {
        int count = 0;
        for (int v = 0; v < getV(); v++)
            for(int w:adj(v))
                if(w == v)
                    count++;
        return count/2;//each edge counted twice
    }

}
