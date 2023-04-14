package dev.beenary;

import java.util.Scanner;

/**
 * Write a Java program that takes numbers from the standard input and prints information on whether the number is even or odd.
 *
 * @author Ana Peterlic
 */
public class Exercise4
{

    public static void main(String[] args)
    {
        // Create Scanner object we'll use for reading values from the console;
        // Note: We need to import Scanner class from java.util package.
        Scanner scanner = new Scanner(System.in);

        // Read the value from the console and store it into local variables:
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0)
        {
            System.out.println("The number is even.");
        } else
        {
            System.out.println("The number is odd.");
        }

    }
}
