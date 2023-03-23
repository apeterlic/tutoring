package dev.beenary.text;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/buffered_writer.txt";
        try
        {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ana-peterlic");
            bufferedWriter.write(" ");
            bufferedWriter.write(String.valueOf(15));
            bufferedWriter.newLine();
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
        }
    }
}
