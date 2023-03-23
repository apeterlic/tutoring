package dev.beenary.text;

import java.io.FileReader;

public class FileReaderDemo
{

    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/file_writer.txt";
        try
        {
            FileReader fileReader = new FileReader(filePath);
            int i;
            while ((i = fileReader.read()) != -1)
            {
                System.out.println((char) i);
            }
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
