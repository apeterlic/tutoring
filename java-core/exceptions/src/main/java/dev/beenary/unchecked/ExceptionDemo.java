package dev.beenary.unchecked;

public class ExceptionDemo
{

    public static void main(String[] args)
    {
        int foodQuantity = 5;

        while (true)
        {
            foodQuantity--;

            if (foodQuantity == 0)
            {
                throw new NoMoreFoodException("No more food on the stock.");
            }
        }
    }
}
