package lesson7.oop;

import lesson7.oop.setterGetter.Dog;
import lesson7.oop.zoo.Zoo;

public class Runner{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat("white", 10.00, "Sonya");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();


        /*System.out.println(cat.colour);
        cat.colour = "Grey";
        System.out.println(cat.colour);

        cat.scratchSofa("Sofa");

        String huntAnimal = cat.hunt(true);
        System.out.println(huntAnimal);

        String hunt2 = cat.hunt(true, false);
        System.out.println(hunt2);

        cat.feed("fish", "meet");*/
    }
}