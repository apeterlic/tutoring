package dev.beenary.text.objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FileReaderDemo
{
    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/order.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));)
        {
            List<Order> orders = new ArrayList<>();
            String row = null;
            while ((row = br.readLine()) != null)
            {
                System.out.println(row);
                String[] data = row.split(";");
                UUID orderNumber = UUID.fromString(data[0]);
                String price = data[1];
                orders.add(new Order(orderNumber, Double.parseDouble(price)));
            }

            System.out.println(orders);
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
