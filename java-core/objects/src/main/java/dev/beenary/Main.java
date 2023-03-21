package dev.beenary;

import dev.beenary.utils.Validator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Testing Zoo class");

        AnimalType lion = new AnimalType("Lion");
        AnimalType zebra = new AnimalType("Zebra");
        AnimalType lemur = new AnimalType("Lemur");

        Animal animal1 = new Animal("Leo", lion);
        Animal animal2 = new Animal("Marty", zebra);
        Animal animal3 = new Animal("Boo", lemur);

        Zoo miniZoo = new Zoo("Mini Zoo", 15, 1);

        System.out.println("Adding animal");
        Validator.assertTrue(miniZoo.addAnimal(animal1));

        System.out.println("Adding animal");
        Validator.assertFalse(miniZoo.addAnimal(animal2));

        System.out.println("Updating animal");
        Validator.assertFalse(miniZoo.setAnimal(animal3, 15));

        System.out.println("Updating animal");
        Validator.assertTrue(miniZoo.setAnimal(animal3, 0));

        Zoo zoo = new Zoo("Cool Zoo", 0, 4);
        System.out.println("Checking size");
        Validator.assertEqual(zoo.getSize(), 10);
    }
}