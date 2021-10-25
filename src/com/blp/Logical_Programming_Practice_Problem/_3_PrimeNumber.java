package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _3_PrimeNumber
{

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner p = new Scanner(System.in);
        int num = p.nextInt();
        prime(num);
    }

    static void prime(int num)
    {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++)
        {
            temp = num % i;
            if (temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

    }
}
