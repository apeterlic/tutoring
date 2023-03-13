package dev.beenary;

public class PalindromeApp
{

    public static void main(String[] args)
    {
        String input = "radar";
        String reversedInput = "";

        int lastIndex = input.length() - 1;

        for (int i = lastIndex; i >= 0; i--)
        {
            char currentChar = input.charAt(i);
            reversedInput = reversedInput + currentChar;
        }

        if (input.equals(reversedInput))
        {
            System.out.printf("%s is palindrome", input);
        } else
        {
            System.out.printf("%s is not palindrome");
        }

    }

}
