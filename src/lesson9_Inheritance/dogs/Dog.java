package lesson9_Inheritance.dogs;

import lesson9_Inheritance.Alive;

public abstract class Dog extends Alive {

    protected final int countLegs = 4;

    public int countTeeth;

    public final static  String LATIN_NAME = "Canis";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark (){
        System.out.println("The dog is barking");
    }

    public abstract void run ();

    public void beAngry (){
        System.out.println("The dog is roaring");
    }

    public final void eat (){
        System.out.println("The dog is eating");
    }
}
