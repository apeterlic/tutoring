package dev.beenary;

import java.util.Scanner;

/**
 * Write a Java program that compares two numbers and prints the result.
 *
 * @author Ana Peterlic
 */
public class Exercise6
{

    public static void main(String[] args)
    {
        // Create Scanner object we'll use for reading values from the console;
        // Note: We need to import Scanner class from java.util package.
        Scanner scanner = new Scanner(System.in);

        // Read the values from the console and store it into local variables:
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Check if variables contains the same number:
        if (first == second)
        {
            System.out.println("Numbers are equal.");
        }
        // Check if first is greater than second:
        else if (first > second)
        {
            System.out.println("The first number is greater than the second.");
        } else
        {
            System.out.println("The second number is greater than the first.");
        }
    }
}
