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
        SelectionProblem selectionProblem = new SelectionProblem();

        using = a;
        System.out.println("\nnext after average element founded by selection : "+ selectionProblem.select(using, N/2));

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
A F R T D G J I R S

next after average element founded by selection : J

Sorted elements by quickSort:
A D F G I J R R S T
Sorted elements by threeWayQuickSort:
A D F G I J R R S T
Process finished with exit code 0

 */