package com.company;

public class BinaryHeap
{
    protected static int N;

    //push element to the down and swim it to the top
    public static void insert(Comparable[] heap, Comparable key)
    {
        heap[ ++N ] = (Comparable) key;
        swim( heap, N );
    }

    //move element to the top if its Key is bigger than parent`s
    //Finish when it will be avoided with every parents
    public static void swim(Comparable[] heap, int index)
    {
        while (index > 1 && less(heap, index/2, index))
        {
            exchange(heap, index, index/2);
            index = index/2;
        }
    }

    //compare two keys in the nodes (two generic)
    public static boolean less(Comparable[] heap, int index1, int index2)
    {
        index1--;
        index2--;
        return heap[index1].compareTo(heap[index2]) < 0;
    }

    //exchange two elements in the heap
    protected static void exchange (Comparable[] heap, int index1, int index2)
    {
        index1--;
        index2--;
        Comparable key = heap[index1];
        heap[index1] = heap[index2] ;
        heap[index2] = (Comparable) key;
    }

    //sinking element when it`s smaller than his child
    public static void sink(Comparable[] heap, int index)
    {
        while( 2*index <= N )
        {
            int childIndex = 2*index;
            if(childIndex < N && less( heap, childIndex, childIndex + 1 ))
                childIndex ++;
            if(!less(heap, index, childIndex ))
                break;
            exchange(heap, index, childIndex );
            index = childIndex;
        }
    }

    //if tree is empty
    public static boolean isEmpty()
    {
        return N == 0;
    }

    //Sort using binary heap
    //Firstly we make a binary heap, then push the maximum to the end and repeat
    public static void sort(Comparable[] heap)
    {
        N = heap.length;
        for( int k = N/2; k >= 1; k--)
            sink (heap, k);
        while( N>1 )
        {
            exchange(heap, 1, N);
        N--;
        sink(heap, 1);
        }
    }
}
