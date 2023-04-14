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
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(EXIT_VALUE))
            {
                System.out.println("The sum is " + sum);
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;

        }

    }
}
