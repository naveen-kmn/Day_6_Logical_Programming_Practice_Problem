package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _9_TemperatureConversion
{
    static float toFar(float celsius)
    {
        return (celsius*9/5)+32;
    }

    static float toCel(float fahrenheit)
    {
        return (fahrenheit-32)*5/9;
    }

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Press 1 for conversion of Fahrenheit to Celsius");
        System.out.println("Press 2 for conversion Celsius to Fahrenheit" );
        System.out.println("Enter your Choice");
        int choice =inp.nextInt();
        if(choice ==1)
        {
            System.out.println("Enter the value in Fahrenheit:");
            float far=inp.nextFloat();
            System.out.println("Temperature in Celsius is "+toCel(far)+" C");
        }
        else if(choice ==2) {
            System.out.println("Enter the value in Celcius:");
            float cel=inp.nextFloat();
            System.out.println("Temperature in Celsius is "+toFar(cel)+" F");
        }

    }
}
