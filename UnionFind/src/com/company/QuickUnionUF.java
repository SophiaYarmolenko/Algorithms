package com.company;

public class QuickUnionUF
{
    private int[] id; // array with id (it can be oun id, or the id of root)

    public QuickUnionUF(int N /*number of points */ )
    {
        id = new int[ N ];
        for ( int i = 0; i < N; i++)
            id[ i ] = i ;
        //set id of each object to itself
    }

    //return the root's id of element i
    private int root ( int i )
    {
        while ( i!= id[ i ])
            i = id[ i ];
        return i;
    }

    //if two points connected (have the same root)?
    public boolean connected (int p, int q)
    {
        return root( p ) == root( q ) ;
    }

    //connect two elements
    public void union ( int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[ i ] = j;
    }
}
