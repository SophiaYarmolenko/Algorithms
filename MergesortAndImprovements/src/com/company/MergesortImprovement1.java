package com.company;

/**
 * - Compare last element on the first array and first element on the second array before merge.
 * - Switch the role of the input and auxiliary array in each recursive call (save time but not space)
 */


public class MergesortImprovement1
{
    private static void merge( Comparable[] a, Comparable aux[], int lo, int mid, int hi )
    {
        int i = lo;
        int j = mid + 1;

        for( int k = lo; k <= hi; k++)
        {
            if( i>mid )
                aux[k] = a[j++];
            else if ( j > hi )
                aux[k] = a[i++];
            else if (less(a[j], a[i]))
                aux[k] = a[j++];
            else
                aux[k] = a[i++];
        }
    }

    private static void sort ( Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if( hi<= lo)
            return;
        int mid = lo + (hi-lo)/2;
        sort(aux, a, lo, mid);
        sort(aux, a, mid+1, hi);
        if ( !less(a[mid+1], a[mid]))
            return;
        merge(a, aux, lo, mid, hi);
    }

    public static void sort( Comparable[] a)
    {
        Comparable[] aux = new Comparable[a.length];
        sort( a, aux, 0, a.length-1);
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
