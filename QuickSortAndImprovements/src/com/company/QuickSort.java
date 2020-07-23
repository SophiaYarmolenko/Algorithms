package com.company;


/**
 * Basic plan:
 * -shuffle the array
 * -partition so that for some j:
 *   -entry a[j] is in place
 *   -no target entry to the left of j
 *   -no smaller entry to the right of j
 *   -sort each piece recursively
 * Improvements:
 * Median of sample
 * - Best choice of pivot item = median
 * - Estimate true median by taking median of sample
 * - Median-of-3 (random items)
 */

public class QuickSort
{
    public static void sort( Comparable[] a)
    {
        sort( a,0, a.length-1);
    }

    private static int partition( Comparable[] a, int lo, int hi)
    {
        int i = lo;
        int j = hi + 1;
        while ( true )
        {
            //find item on left to swap
            while( less( a[++i], a[lo]))
                if( i== hi)
                    break;
            //find item on right to swap
            while( less( a[lo], a[--j]))
                if( j == lo )
                    break;
            //check if pointers cross => swap
            if ( i >= j )
                break;
            exch ( a, i, j);
        }
        exch(a, lo, j); //swap with partitioning item
        return j; //return index of item now known to be in place
    }

    private static void sort ( Comparable[] a, int lo, int hi)
    {
        if ( hi <= lo )
            return;
        int m = medianOf3 (a, lo, lo + ( hi-lo )/2 , hi);
        exch(a, lo, m);
        int j = partition(a, lo, hi);
        sort( a, lo, j - 1);
        sort( a, j+1, hi);
    }

    private static <T extends Comparable<? super T>> int medianOf3(T[] array, int a, int b, int c)
    {
        if (array[a].compareTo(array[b]) >= 0 && array[a].compareTo(array[c]) >= 0)
            return a;
        if (array[b].compareTo(array[a]) >= 0 && array[b].compareTo(array[c]) >= 0)
            return b;
        else
            return c;
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
