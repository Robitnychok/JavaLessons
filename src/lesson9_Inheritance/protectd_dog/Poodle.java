package lesson9_Inheritance.protectd_dog;

import lesson9_Inheritance.dogs.Dog;

public class Poodle extends Dog {

    public Poodle (){
        super(2);
    }

    public void run (){
        System.out.println(" The dog is running slowly");
    }

    public void breath() {
        System.out.println("The dog is breathing slowly");
    }

    @Override
    public void beAngry (){
        System.out.println("The dog saw a cat");
        super.beAngry();
        System.out.println("The dog is running on " + countLegs +"Legs");
    }
}
