package dev.beenary;

public class Monkey
{
    private String name;
    private String type;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

public void setAge(int age)
{
    if(age < 0){
        throw new IllegalArgumentException("Age must be greater than 0.");
    }
    this.age = age;
}
}
