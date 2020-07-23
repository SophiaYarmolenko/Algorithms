package com.company;

/**
 * Help with duplicate keys
 * QuickSort with duplicate keys: goes quadratic unless partitioning stops on equal keys
 */
public class ThreeWayQuickSort
{
    public static void sort( Comparable[] a)
    {
        sort( a,0, a.length-1);
    }

    private static void sort ( Comparable[] a, int lo, int hi)
    {
        if ( hi <= lo )
            return;
        int lt = lo;
        int gt = hi;
        Comparable v = a[lo];
        int i = lo;
        while ( i<= gt )
        {
            int cmp = a[i].compareTo(v);
            if(cmp < 0)
                exch(a, lt++, i++);
            else if( cmp > 0 )
                exch( a, i, gt--);
            else
                i++;
        }
        sort( a, lo, lt-1);
        sort( a, gt+1, hi);
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
