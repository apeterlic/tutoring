package dev.beenary.text;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo
{
    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/print_writer.txt";
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(fileWriter))
        {
            printWriter.write("test");
            printWriter.write("beenary");
            printWriter.print("value1");
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }

    }
}
