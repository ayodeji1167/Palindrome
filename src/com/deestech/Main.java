package com.deestech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter five digit number: ");
        digit = input.nextInt();

        while (digit != -1) {
            String strVal = String.valueOf(digit);

            // Check if user enters 5 digits
            if (strVal.length() == 5) {

                // Check if it is a palindrome
                if (strVal.charAt(0) == strVal.charAt(4) && strVal.charAt(1) == strVal.charAt(3)) {
                    System.out.println("This is a palindrome");
                    break;
                } else {
                    System.out.println("This is not a palindrome");
                    break;
                }
            } else {
                System.out.println("Please enter 5 digit number");
                digit = input.nextInt();
                continue;
            }
        }

    }
}
