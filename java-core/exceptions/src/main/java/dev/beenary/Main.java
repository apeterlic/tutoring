package dev.beenary;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> animals = List.of("lion", "zebra", "crocodile", "giraffe", "elephant");
        String animal = animals.get(10);
        System.out.println(animal);
    }
}