package dev.beenary;

import java.util.Scanner;

public class Exercise4
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        String number = scanner.next();

        if (number.length() < 2)
        {
            System.out.println("The number is too small");
        } else
        {
            String reversedNumber = reverseValue(number);
            System.out.println(reversedNumber);
        }
    }

    /**
     * Reverses the given String value and returns the result.
     * @param number :: the value to reverse.
     * @return result :: the reversed value.
     */
    private static String reverseValue(String number)
    {
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--)
        {
            char digit = number.charAt(i);
            reversedNumber.append(digit);
        }

        return reversedNumber.toString();
    }
}
