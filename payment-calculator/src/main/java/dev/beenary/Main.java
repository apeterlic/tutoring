package dev.beenary;

import java.util.Arrays;
import java.util.Scanner;

class Student
{
    String name;
    int age;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student("S1", 34);
        Student s2 = new Student("S2", 3);
        Student s3 = new Student("S3", 12);

        Student[] students = new Student[]{s1, s2, s3};


        System.out.println(Arrays.toString(students));

        int n = students.length;
        Student temp;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (students[j].getAge() > students[j + 1].getAge())
                {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(students));


        // int[] arr = new int[]{1, 9, 3};
        System.out.println(students);
        System.out.println(Arrays.toString(students));

        int totalMinutes = 0;
        while (true)
        {

            // 0d3h5m
            System.out.println("Insert work time: xdxhxm");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x"))
            {
                break;
            }


            String days = input.substring(0, input.indexOf('d'));
            String hours = input.substring(input.indexOf('d') + 1, input.indexOf('h'));
            String minutes = input.substring(input.indexOf('h') + 1, input.indexOf('m'));

            int d = Integer.parseInt(days) * 8 * 60;
            totalMinutes += d;

            int h = Integer.parseInt(hours) * 60;
            totalMinutes += h;

            totalMinutes += Integer.parseInt(minutes);

            System.out.println("Total work in minutes: " + totalMinutes);
        }


        System.out.println("Total work in minutes: " + totalMinutes);
        System.out.println("Total work in hours: " + (double) totalMinutes / 60);
        System.out.println("You'll get paid: " + (double) totalMinutes / 60 * 20);

    }
}