package com.company;

import edu.princeton.cs.algs4.StdRandom;

public class SelectionProblem extends QuickSort
{
    // return k-th element on the unsorted collection
    public static Comparable select (Comparable[] a, int k)
    {
        StdRandom.shuffle(a);
        int lo = 0;
        int hi = a.length-1;
        while (hi > lo)
        {
            int j = partition(a, lo, hi);
            if(j < k)
                lo = j + 1;
            else if (j > k)
                hi = j - 1;
            else
                return a[k];
        }
        return a[k];
    }
}
