package com.blp.Logical_Programming_Practice_Problem;

import java.text.MessageFormat;
import java.util.Scanner;

public class _8_DayOfWeek
{
        static int dayOfWeak(int day, int month, int year)
        {
            int y=year-(14-month)/12;
            int x=y+y/4-y/100+y/400;
            int m=month +12*((14-month)/12)-2;
            int d=(day+x+31*m/12)%7;
            return d;
        }

        public static void main(String[] args)
        {
            Scanner inp=new Scanner(System.in);

            System.out.println("Enter the month between 1-12 ");
            int month=inp.nextInt();
            System.out.println("Enter the day of month 1-30 ");
            int day=inp.nextInt();
            System.out.println("Enter the year");
            int year=inp.nextInt();
            System.out.println(MessageFormat.format("Weak day is {0}", dayOfWeak(day, month, year)));
        }

}
