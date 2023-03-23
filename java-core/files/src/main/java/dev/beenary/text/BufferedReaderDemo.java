package dev.beenary.text;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo
{
    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/file_writer.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String row;
            while ((row = br.readLine()) != null)
            {
                System.out.println(row);
            }
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
