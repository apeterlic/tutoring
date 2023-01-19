package dev.beenary;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TheSmallestNumberApp
{
    public static void main(String[] args)
    {
        // first approach - loops
        List<Integer> numbers1 = Arrays.asList(4, 5, 7, 3, 2, 1, 8, 6);

        int smallest = numbers1.get(0);

        for(Integer number : numbers1){
            if(number < smallest){
                smallest = number;
            }
        }

        System.out.printf("The smallest number %d %n", smallest);

        // second approach - Collections
        List<Integer> numbers2 = Arrays.asList(6, 0, -4, 7, 13, 17, 9, 45);
        Collections.sort(numbers2);

        System.out.printf("The smallest number %d %n", numbers2.get(0));

        // third approach - streams
        List<Integer> numbers3 = Arrays.asList(30, 51, 44, 20, 13, 17, 9, 45);

       int smallest2 = numbers3.stream().min(Comparator.comparingInt(Integer::intValue)).get();

        System.out.printf("The smallest number %d %n", smallest2);


    }
}
