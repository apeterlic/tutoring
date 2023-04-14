package dev.beenary;

/**
 * Write a Java program that divides two numbers and prints the rounded value in the standard output.
 * @author Ana Peterlic
 */
public class Exercise2
{

    public static void main(String[] args)
    {
        // Define local variables that will hold two numbers.
        int first = 58;
        int second = 15;

        // The code below would produce incorrect result. It wouldn't round the number as expected.
        // int result = first / second;
        // System.out.println("The result is " + result);

        // Firstly, we'd need to cast one operand to decimal value.
        // This way, we'd get decimal number as a result.
        double result = first / (double) second;

        // Secondly, we'd need to call Math.round() method to round the number correctly:
        double roundedResult = Math.round(result);

        // Finally, let's print the result in the console.
        System.out.println("The result is " + roundedResult);

    }
}
