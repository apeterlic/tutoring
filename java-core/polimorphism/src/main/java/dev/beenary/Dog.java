package dev.beenary;

import java.time.Month;

public class Dog implements Furry
{
    @Override
    public Month getTheFurriestMonth()
    {
        return Month.JUNE;
    }
}
