package dev.beenary;

public class Main
{
    public static void main(String[] args)
    {
//        String a = "bee";
//        String b = "nary";
//        String c = a + b; // beenary


        System.out.println("Hello world!");


        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println(1 + 8 + "5"); // 95

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        String s = new String("    aa   ");
        s.trim();
        System.out.println(s);

String s1 = "   abc";
String s2 = s1.trim().toUpperCase();

String a = "animal";
System.out.println(a.lastIndexOf('a')); // 0
System.out.println(a.indexOf("al")); // 4
System.out.println(a.indexOf('a', 4)); // 4
System.out.println(a.indexOf("al", 5)); // -1
System.out.println(a.substring(1, 15)); // -1

    }
}