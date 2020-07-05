package com.company;

import java.util.Scanner;

public class MaxPQ <Key extends Comparable <Key> > extends BinaryHeap
{
    public static Comparable[] heap;

    //make elements in the heap comparable (non generic array)
    public MaxPQ(int capacity)
    {
        heap = (Key[]) new Comparable[capacity+1];
    }

    public static <Key> Key delMax()
    {
        Key max = (Key) heap[1];
        exchange(heap, 1, N--);
        sink(heap,1);
        heap[ N+1 ] = null;
        return max;
    }

    //exchange two elements in the heap
    protected static void exchange (Comparable[] heap, int index1, int index2)
    {
        Comparable key = heap[index1];
        heap[index1] = heap[index2] ;
        heap[index2] = (Comparable) key;
    }

    //compare two keys in the nodes (two generic)
    public static boolean less(Comparable[] heap, int index1, int index2)
    {
        return heap[index1].compareTo(heap[index2]) < 0;
    }


    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, give the number of elements in collection ");
        int N = scan.nextInt();
        System.out.println("Write every next element in collection in the next line");
        heap = new Comparable[N];
        for(int i = 0; i < 5; i++)
        {
            heap[i] = scan.next();
        }
        sort(heap);
        System.out.println("Sorted collection: ");
        for(int i = 0; i<5; i++)
            System.out.println(heap[i]+" ");
    }

}
