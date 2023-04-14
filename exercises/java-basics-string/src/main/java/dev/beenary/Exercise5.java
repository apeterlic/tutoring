package dev.beenary;

import java.util.Scanner;

public class Exercise5
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

            if (Character.isLetter(character))
            {
                stringBuilder.append(character);
            }

        }

        String onlyLetters = stringBuilder.toString();

        if (onlyLetters.isEmpty())
        {
            System.out.println("The value doesn't contain letters.");
        } else if (onlyLetters.length() == input.length())
        {
            System.out.println("The value contains only letters.");
        } else
        {
            System.out.println(onlyLetters);
        }

    }
}
