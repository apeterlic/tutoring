package dev.beenary.text.objects;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.UUID;

public class FileWriterDemo
{

    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/order.txt";
        Order order = new Order(UUID.randomUUID(), 50.85);

        try (FileWriter fileWriter = new FileWriter(filePath, true); PrintWriter printWriter = new PrintWriter(fileWriter))
        {
            printWriter.println(order);
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
