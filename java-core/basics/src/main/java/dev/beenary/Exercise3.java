package dev.beenary;

import java.util.Scanner;

/**
 * Write a Java program that takes two numbers from the standard input and prints
 * the results of addition, subtraction, multiplication, and division of those numbers.
 *
 * @author Ana Peterlic
 */
public class Exercise3
{
    public static void main(String[] args)
    {

        // Create Scanner object we'll use for reading values from the console;
        // Note: We need to import Scanner class from java.util package.
        Scanner scanner = new Scanner(System.in);

        // Read the values from the console and store it into local variables:
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Perform requested operations:
        int additionResult = first + second;
        int subtractionResult = first - second;
        int multiplicationResult = first * second;
        int divisionResult = first / second;

        // Print the results in the console:
        System.out.println("Sum: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);

    }
}
