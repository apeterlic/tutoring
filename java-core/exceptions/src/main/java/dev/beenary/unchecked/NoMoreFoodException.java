package dev.beenary.unchecked;

public class NoMoreFoodException extends RuntimeException
{

    public NoMoreFoodException()
    {
    }

    public NoMoreFoodException(String message)
    {
        super(message);
    }

    public NoMoreFoodException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
