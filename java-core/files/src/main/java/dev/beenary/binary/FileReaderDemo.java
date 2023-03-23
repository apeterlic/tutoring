package dev.beenary.binary;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileReaderDemo
{
    public static void main(String[] args)
    {
        String filePath = "java-core/files/dat/item.dat";
        Item item = readFromFile(filePath);
        System.out.println(item);
    }

    public static Item readFromFile(String filePath)
    {
        try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis))
        {
            Object obj = ois.readObject();
            return (Item) obj;
        } catch (Exception e)
        {
            System.err.println("Error - " + e);
            return null;
        }
    }
}
