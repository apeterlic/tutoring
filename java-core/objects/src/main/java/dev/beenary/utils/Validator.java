package dev.beenary.utils;

public class Validator
{

    public static void assertTrue(boolean value){
        if(value == false){
            System.err.printf("Value is not true");
        }
    }

    public static void assertFalse(boolean value){
        if(value == true){
            System.err.printf("Value is not false");
        }
    }

    public static  <T> void assertEqual(T o1, T o2){
        if(!o1.equals(o2)){
            System.err.printf("Values not equal %s %s%n", o1, o2);
        }
    }
}
