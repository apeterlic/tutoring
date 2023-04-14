package dev.beenary;

import java.util.Scanner;

public class Exercise6
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one word:");
        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char character = input.charAt(i);

            if (i != 0 && i % 2 == 0)
            {
                stringBuilder.append(".");
            }

            stringBuilder.append(character);
        }

        System.out.println(stringBuilder);

    }
}
