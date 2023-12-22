package lesson10_Polymorphism;

public class Dog extends Animal{


    @Override
    public void eat() {
        System.out.println("The dog eats");
    }

    public void bark (){
        System.out.println("bark");
    }
}
