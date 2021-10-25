package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _2_PerfectNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner p =new Scanner(System.in);
        int num = p.nextInt();
        int sum=0;
        for (int i=1; i<num; i++)
        {
            if(num%i == 0)
            {
                sum = sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println(+num+" is a Perfect number.");
        }
        else
        {
            System.out.println(+num+" is not a Perfect number.");
        }

    }
}
