package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _1_FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner f = new Scanner (System.in);
        System.out.println("Enter the number");

        int num = f.nextInt();
        fibboSeries(num);
    }
    static void fibboSeries(int num)
    {
        int n1=0,n2=1,n3,i;
        System.out.println("Fibonacci Series");
        System.out.print(n1+" "+n2);
        for(i=2;i<num;++i)
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
