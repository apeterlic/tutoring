package dev.beenary.checked;

public class DuplicateValueException extends Exception
{
    public DuplicateValueException()
    {
    }

    public DuplicateValueException(String message)
    {
        super(message);
    }
}
