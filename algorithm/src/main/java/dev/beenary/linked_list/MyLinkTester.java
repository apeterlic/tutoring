package dev.beenary.linked_list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MyLinkTester
{

    public static void main(String[] args)
    {
        MyList myList = new MyList();
        List<Integer> l = Arrays.asList(7,
                1,
                2,
                3,
                5,
                6,
                4,
                1);

        for (int i = 0; i < l.size(); i++)
        {
            myList.add(l.get(i));
        }

        // System.out.println(myList.toString());

        System.out.println("FIRST");
        // testAddMethod(myList);

        testAddandRemoveMethod(new MyList(), 5, -5);

        Scanner in = new Scanner(System.in);
        myList = new MyList();

        System.out.println(myList.length());

        int toAdd = in.nextInt();
        myList.add(toAdd);

        System.out.println(myList.length());

        int indexToRemove = in.nextInt();

        System.out.println(myList.remove(indexToRemove));
        System.out.println(myList.length());

        int numElements = in.nextInt();

        myList = new MyList();

        for (int i = 0; i < numElements; i++)
        {
            myList.add(in.nextInt());
        }

        System.out.println(myList.length());
        System.out.print(myList.get(in.nextInt()));

    }

    public static void testAddMethod(MyList myList)
    {
        System.out.println("Length: " + myList.length());
        System.out.println("List: " + myList);
    }

    static void testAddandRemoveMethod(MyList myList, int toAdd, int indexToRemove)
    {
        myList.add(toAdd);
        System.out.println("Length: " + myList.length());
        System.out.println(myList.remove(indexToRemove));
        System.out.println(myList.length());
    }

    static void testGetMethod(MyList myList, int indexToGet)
    {
        System.out.println("Length: " + myList.length());
        System.out.println(myList.get(indexToGet));
    }

    static void testGetAllMethod(MyList myList)
    {
        System.out.println("Length: " + myList.length());

        for (int i = 0; i < myList.length(); i++)
        {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }

    static void testFillAndEmpty(MyList myList)
    {
        while (myList.length() > 0)
        {
            System.out.print(myList.remove(0) + " ");
        }
        System.out.println();
    }


    static void testFillAndEmptyBottom(MyList myList)
    {
        while (myList.length() > 0)
        {
            System.out.print(myList.remove(myList.length() - 1) + " ");
        }
    }

}
