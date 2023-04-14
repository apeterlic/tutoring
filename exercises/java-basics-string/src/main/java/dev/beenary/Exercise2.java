package dev.beenary;

import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.printf("The sentence contains %d words", words.length);

    }
}
