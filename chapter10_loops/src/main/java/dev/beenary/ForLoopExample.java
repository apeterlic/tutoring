package dev.beenary;

public class ForLoopExample
{
    public static void main(String[] args)
    {
int sum = 0;
for(int i = 0; i < 10; i++){
    sum += i;
}

//i = 0; // compiler error - out of scope
    }
}
