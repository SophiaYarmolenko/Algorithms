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

        QuickSort quickSort = new QuickSort();
        ThreeWayQuickSort threeWayQuickSort = new ThreeWayQuickSort();

        using = a;
        quickSort.sort(using);
        System.out.println("\nSorted elements by quickSort: ");
        for(Comparable i:using)
            System.out.print(i+" ");

        using = a;
        threeWayQuickSort.sort(using);
        System.out.println("\nSorted elements by threeWayQuickSort: ");
        for(Comparable i:using)
            System.out.print(i+" ");

    }
}
/*Example:
Please, give a number of elements that you want to sort
10
Please, give elements that you want to sort
A E R F G W R F T H

Sorted elements by quickSort:
A E F F G H R R T W
Sorted elements by threeWayQuickSort:
A E F F G H R R T W
 */