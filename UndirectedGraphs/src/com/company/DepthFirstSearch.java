package com.company;

public class DepthFirstSearch
{
    private boolean[] marked;
    private int[] edgTo;
    private int V;//number of vertices

    public DepthFirstSearch(UndirectedGraph G, int s)
    {
        V = G.getV()+1;
        marked = new boolean[V];
        edgTo = new int[V];
        dfs(G, s);//find vertices connected to s
    }

    //recursive dfs does the work
    private void dfs(UndirectedGraph G, int v)
    {
        marked[v] = true;//marked[v] = true if v connected to s. edjTo[v] = previous vertex on a path from s to v
        for(int w:G.adj(v))
            if(!marked[w])
            {
                dfs(G, w);
                edgTo[w] = v;
            }
    }
}
