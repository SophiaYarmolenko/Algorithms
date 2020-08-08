package com.company;

public class ConnectedComponents
{
    private boolean marked[];
    private int[] id;//id[v] = id of component containing v
    private int count; // number of components

    public ConnectedComponents(UndirectedGraph G)
    {
        marked = new boolean[G.getV()];
        id = new int[G.getV()];
        for( int v = 0; v < G.getV(); v++)
        {
            if(!marked[v])
            {
                dfs(G, v);//run dfs from one vertex in each component
                count++;
            }
        }
    }

    public int count()
    {
        return count;
    }

    public int id(int v)
    {
        return id[v];
    }

    private void dfs(UndirectedGraph G, int v)
    {
        marked[v] = true;//marked[v] = true if v connected to s. edjTo[v] = previous vertex on a path from s to v
        id[v] = count;
        for(int w:G.adj(v))
            if(!marked[w])
                dfs(G, w);//all vertices discovered in same call of dfs have same id
    }
}
