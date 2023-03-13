package dev.beenary;

import java.time.Month;

public class Cat implements Furry
{
    @Override
    public Month getTheFurriestMonth()
    {
        return Month.APRIL;
    }
}
