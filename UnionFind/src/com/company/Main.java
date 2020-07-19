package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int N;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        ImprovedQuickUnionUF iUF = new ImprovedQuickUnionUF(N+1);
        iUF.union(2, 4);
        iUF.union(5, 6);
        iUF.union(2,6);
        System.out.println( iUF.connected(4, 5) );
    }
}
