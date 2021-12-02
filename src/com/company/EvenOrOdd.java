package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

	// Logic to find even or odd number.
        Scanner sn = new Scanner(System.in);
        int num;

        System.out.println("Find if the given number is an even or odd number");
        System.out.println("--------------------------------------------");
        System.out.println("Please enter any whole number now : ");

        if(sn.hasNextInt()) {
            num = sn.nextInt();
            if (num % 2 == 0) {
                System.out.println("\"" + num + "\"" + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
        }
        else
        {
            System.out.println("Oops! The entered value is not a whole value.");
        }

    }
}
