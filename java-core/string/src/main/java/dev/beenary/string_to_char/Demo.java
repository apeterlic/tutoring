package dev.beenary.string_to_char;

public class Demo
{
    public static void main(String[] args)
    {
        String animal = "animal";

        char[] chars = animal.toCharArray();

        for (char c : chars)
        {
            System.out.println(c);
        }
    }
}
