package dev.beenary;

public class Zoo
{

    private String name;
    private int size;
    private Animal[] animals;
    private int capacity;

    private int currentIndex = 0;

    public Zoo(String name, int size, int capacity)
    {
        this.name = name;
       setSize(size);
        this.capacity = capacity;
        this.animals = new Animal[capacity];
    }

    public boolean addAnimal(Animal animal){
        if(currentIndex == this.capacity){
            System.out.println("Zoo is full");
            return false;
        }

        animals[currentIndex++] = animal;
        return true;
    }

    public boolean setAnimal(Animal animal, int index){
        if(index > this.capacity - 1){
            System.out.println("Invalid argument index");
            return false;
        }

        animals[index] = animal;
        return true;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        if(size <= 0){
            System.out.println("Size must be greater than 0.");
            this.size = 10;
        }else
        {
            this.size = size;
        }
    }

    public Animal[] getAnimals()
    {
        return animals;
    }

    public void setAnimals(Animal[] animals)
    {
        this.animals = animals;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
