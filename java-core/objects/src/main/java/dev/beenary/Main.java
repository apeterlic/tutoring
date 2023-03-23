package dev.beenary;

public class Main
{
    public static void main(String[] args)
    {

        str("bla", "8", "vds");

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

    private static class Validator
    {

        public static void assertTrue(boolean value)
        {
            if (value == false)
            {
                System.err.printf("Value is not true");
            }
        }

        public static void assertFalse(boolean value)
        {
            if (value == true)
            {
                System.err.printf("Value is not false");
            }
        }

        public static <T> void assertEqual(T o1, T o2)
        {
            if (!o1.equals(o2))
            {
                System.err.printf("Values not equal %s %s%n", o1, o2);
            }
        }
    }

    static void str(String... values){
        String[] sdf = values;

        for(String s : sdf){
            System.out.println(s);
        }
    }
}