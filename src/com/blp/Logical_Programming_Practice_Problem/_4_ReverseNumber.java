package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _4_ReverseNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        int reverse = 0;
        while (num != 0)
        {
            reverse = ((reverse * 10) + num % 10);
            num = num / 10;
        }
        System.out.println("After reversing = "+reverse);
    }

}