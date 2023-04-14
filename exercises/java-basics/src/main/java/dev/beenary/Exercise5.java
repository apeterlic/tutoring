package dev.beenary;

import java.util.Scanner;

/**
 * Write a Java program that takes four numbers and prints the average value of those numbers.
 *
 * @author Ana Peterlic
 */
public class Exercise5
{

    public static void main(String[] args)
    {
        // Create Scanner object we'll use for reading values from the console;
        // Note: We need to import Scanner class from java.util package.
        Scanner scanner = new Scanner(System.in);

        // Read the values from the console and store it into local variables:
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();

        // To calculate average value, first we need to get the sum of given numbers.
        int sum = first + second + third + fourth;

        // Finally, we need to divide the sum with the number of numbers to get the average value.
        // Note: We need to store the number as double. To get the decimal value, we need to cast one of the operands to double.
        double average = sum / (double) 4;

        // Print the result
        System.out.println("The average value is " + average);
    }
}
