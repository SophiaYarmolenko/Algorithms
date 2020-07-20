package com.company;

public class InsertionSort
{
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for( int i = 0; i < N; i++)
            for( int j = i; j > 0; j--)
                if( less( a[ j ], a[ i ] ) )
                    exch( a, j, i);
                else break;
    }

    private static boolean less (Comparable v, Comparable w )
    {
        return v.compareTo(w) < 0;
    }

    private static void exch (Comparable[] a, int i, int j)
    {
        Comparable element = a[ i ];
        a[ i ] = a[ j ];
        a[ j ] = element;
    }
}
