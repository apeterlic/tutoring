package dev.beenary;

import java.util.Scanner;

public class PaymentCalculatorApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

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