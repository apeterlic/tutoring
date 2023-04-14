package dev.beenary;

import java.util.Scanner;

public class Exercise7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char character = input.charAt(i);

            if (!Character.isDigit(character))
            {
                stringBuilder.append(character);
            }

        }

        System.out.println(stringBuilder);

    }
}
