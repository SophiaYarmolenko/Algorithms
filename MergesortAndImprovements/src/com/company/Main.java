package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N ;
        Comparable[] a;
        Comparable[] using;

        System.out.println("Please, give a number of elements that you want to sort ");
        N = scan.nextInt();
        a = new Comparable[N];
        using = new Comparable[N];

        System.out.println("Please, give elements that you want to sort ");
        for(int i = 0; i < N; i++)
        {
            a[i] = scan.next();
        }

        MergesortRecursion mergesortRecursion = new MergesortRecursion();
        MergesortImprovement1 mergesortImprovement1 = new MergesortImprovement1();
        BottomUpMergesort bottomUpMergesort = new BottomUpMergesort();

        using = a;
        mergesortRecursion.sort(using);
        System.out.println("\nSorted elements by mergesortRecursion: ");
        for(Comparable i:using)
            System.out.print(i+" ");

        using = a;
        mergesortImprovement1.sort(using);
        System.out.println("\nSorted elements by mergeSortImprovements: ");
        for(Comparable i:using)
            System.out.print(i+" ");

        using = a;
        bottomUpMergesort.sort(using);
        System.out.println("\nSorted elements by bottomUpMergesort: ");
        for(Comparable i:using)
            System.out.print(i+" ");
    }
}
/*Example:
Please, give a number of elements that you want to sort
10
Please, give elements that you want to sort
G A C B E R T K U H

Sorted elements by mergesortRecursion:
A B C E G H K R T U
Sorted elements by mergeSortImprovements:
A B C E G H K R T U
Sorted elements by bottomUpMergesort:
A B C E G H K R T U
 */