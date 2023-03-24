package dev.beenary.checked;

public class ExceptionDemo
{
    public static void main(String[] args) throws DuplicateValueException
    {

        String[] values = {"lion", "zebra", "lemur", "hypo", "zebra"};
        checkForDuplicates(values);

    }

    private static void checkForDuplicates(String[] values) throws DuplicateValueException
    {
        String[] noDuplicates = new String[values.length];

        for (int i = 0; i < values.length; i++)
        {

            String value = values[i];

            for (String noDuplicate : noDuplicates)
            {
                if (value.equals(noDuplicate))
                {
                    throw new DuplicateValueException("Duplicate value found");
                }
            }

            noDuplicates[i] = value;
        }
    }
}
