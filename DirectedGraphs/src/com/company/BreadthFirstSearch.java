package com.company;

import edu.princeton.cs.algs4.Queue;

public class BreadthFirstSearch
{

    private boolean[] marked;
    private int[] edgTo;
    private int V;//number of vertices

    public BreadthFirstSearch(DirectedGraph G, int s)
    {
        V = G.getV()+1;
        marked = new boolean[V];
        edgTo = new int[V];
        bfs(G, s);//find vertices connected to s
    }

    private void bfs(DirectedGraph G, int s)
    {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(s);
        marked[s] = true;
        while(!q.isEmpty())
        {
            int v = q.dequeue();
            for( int w:G.adj(v))
            {
                if(!marked[w])
                {
                    q.enqueue(w);
                    marked[w] = true;
                    edgTo[w] = v;
                }
            }
        }
    }
}
