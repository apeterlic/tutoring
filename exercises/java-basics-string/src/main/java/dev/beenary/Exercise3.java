package dev.beenary;

import java.util.Scanner;

public class Exercise3
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter word number:");
        int number = scanner.nextInt();

        String[] words = sentence.split(" ");

        if (number > words.length)
        {
            System.out.println("Word does not exist.");
        } else
        {
            String word = words[number - 1];
            System.out.println(word);
        }

    }
}
