package dev.beenary.string_to_int;

public class Demo
{

    public static void main(String[] args)
    {
        // convert int to String
        int number = 5;
        String s = String.valueOf(number);
        System.out.println(s);

        // convert String to int
        String s2 = "34";
        int number2 = Integer.parseInt(s2);
        System.out.println(number2);
    }
}
