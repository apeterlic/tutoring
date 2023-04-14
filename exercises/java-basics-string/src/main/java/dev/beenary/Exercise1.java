package dev.beenary;

import java.util.Scanner;

public class Exercise1
{

    public static final String EXIT_VALUE = "x";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true)
        {
            System.out.println("Enter the number (or x to exit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(EXIT_VALUE))
            {
                System.out.printf("The sum is %d", sum);
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;

        }

    }
}
