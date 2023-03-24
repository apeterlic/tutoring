package dev.beenary.unchecked;

public class TryCatchDemo
{
    public static void main(String[] args)
    {
        int foodQuantity = 5;

        try
        {
            while (true)
            {
                foodQuantity--;

                if (foodQuantity == 0)
                {
                    throw new NoMoreFoodException("No more food on the stock.");
                }
            }
        } catch (NoMoreFoodException e)
        {
            System.err.println("An error occurred!");
        } catch (Exception e)
        {
            System.err.println("Something went wrong.");
        } finally
        {
            System.out.println("Notify administrator.");
        }
    }
}
