package dev.beenary;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println("Hello world!");

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(5);

        int i = 0;
        System.out.println(list1.size());

        while (i < list1.size()){
            System.out.println("i: " + i);
            Integer in = list1.get(i);
            System.out.println("In start: " + in);

            if(list2.contains(in)){
                System.out.println("In: " + in);
                list1.remove(in);
                continue;
            }
            i++;
        }

        list1.forEach(System.out::println);

    }

    <T>List<T> reverse(List<T> list){

        List<T> reverse = new LinkedList<>();

        for(int i = (list.size()-1); i >= 0; i--){
            reverse.add(list.get(i));
        }

        return reverse;
    }

    <T>List<T> filter(List<T> list, Collection<T> filter){

        List<T> list1 = new LinkedList<>();

        // only ones that are in input and collection

        for(int i = 0; i < list.size(); i++){
           // if(filter.contains())
            //Arrays.copyOf()
        }

    }
}