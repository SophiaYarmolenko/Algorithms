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

        /*Selection selection = new Selection();
        InsertionSort insertionSort = new InsertionSort();
        ShellSort shellSort = new ShellSort();

        using = a;
        selection.sort(using);
        System.out.println("\nSorted elements by selection: ");
        for(Comparable i:using)
            System.out.print(i+" ");

        using = a;
        insertionSort.sort(using);
        System.out.println("\nSorted elements by insertionSort: ");
        for(Comparable i:using)
            System.out.print(i+" ");

        using = a;
        shellSort.sort(using);
        System.out.println("\nSorted elements by shellSort: ");
        for(Comparable i:using)
            System.out.print(i+" ");*/
    }
}
/*Example:
Please, give a number of elements that you want to sort
10
Please, give elements that you want to sort
A H R E B S D W R T
Sorted elements by selection:
A B D E H R R S T W
Sorted elements by insertionSort:
A B D E H R R S T W
Sorted elements by shellSort:
A B D E H R R S T W
 */