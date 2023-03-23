package dev.beenary.text;

import java.io.FileWriter;

public class FileWriterDemo
{

    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/file_writer.txt";
        try
        {
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write("15646465464");
            fileWriter.write(" ");
            fileWriter.write('j');
            fileWriter.write(" ");
            fileWriter.write(String.valueOf(15));
            fileWriter.write("\n");
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
