package com.company;

/** Mergesort without recursion
 * - Pass through array, merging subarrays of size 1
 * - Repeat for subarrays of size 2, 4, 8, 16 ...
 * Concise industrial-strength code, if you have the space
 */

public class BottomUpMergesort
{
    private static Comparable[] aux;

    private static void merge(Comparable[] a, int lo, int mid, int hi)
    {
        for( int k = lo; k <= hi; k++ )
            aux[k] = a[k];
        int i = lo;
        int j = mid + 1;
        for( int k = lo; k <= hi; k++)
        {
            if( i>mid )
                a[k] = aux[j++];
            else if ( j > hi )
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
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

    public static void sort ( Comparable[] a)
    {
        int N = a.length;
        aux = new Comparable[N];
        for( int sz = 1; sz < N; sz*=2)
            for( int lo = 0; lo < N-sz; lo += 2*sz)
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    }
}
