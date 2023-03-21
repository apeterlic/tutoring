package dev.beenary.course;

import java.util.Arrays;

public class LengthExample
{

    public static void main(String[] args)
    {
        String s = "animal";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.print(c);
        }

        // 6 0 5
        //  i = 0   i = 1 i = 2
         //  j = 1  j = 2
        // 6 > 5
        // temp = 6
        // 6 -> 5
        // 5 -> 6
        //
    }
}
