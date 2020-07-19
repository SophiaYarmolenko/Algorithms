package com.company;

/**
 * It is better union-find
 * It contains two improvement:
 * 1) Weighted quick-union
 * - Modify quick-union to avoid tall trees.
 * - Keep track of size of each tree (number of objects)
 * -Balance by linking root of smaller tree to root of larger tree
 * 2) Path compression
 * -Just after computing the root of p, set the id of each examined node to point to that root
 */

public class ImprovedQuickUnionUF
{
    private int[] id; // array with id (it can be oun id, or the id of root)
    private int[] sz;

    public ImprovedQuickUnionUF(int N /*number of points */ )
    {
        id = new int[ N ];
        sz = new int[ N ];
        for ( int i = 0; i < N; i++)
        {
            id[ i ] = i ;//set id of each object to itself
            sz[ i ] = 1 ;//set the size of 1 element
        }

    }

    //Make every other node in path point to its grandparent and return the root's id of element i
    private int root ( int i )
    {
        while ( i!= id[ i ])
        {
            id[ i ] = id[ id[i] ] ;
            i = id[ i ] ;
        }
        return i;
    }

    //if two points connected (have the same root)?
    public boolean connected (int p, int q)
    {
        return root( p ) == root( q ) ;
    }

    //compare a size of the trees and attach a smaller tree to a larger one
    public void union ( int p, int q)
    {
        int i = root(p);
        int j = root(q);
        if ( i == j )
            return;
        if ( sz[i] < sz[j] )
        {
            id[ i ] = j;
            sz[ j ] += sz[ i ];
        }
        else
        {
            id[ j ] = i;
            sz[ i ] += sz[j];
        }
    }
}
