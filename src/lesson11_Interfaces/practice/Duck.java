package lesson11_Interfaces.practice;

public class Duck implements Swimming, Flying {

    public void swim (){
        System.out.println("The duck is swimming");
    }

    public void fly (){
        System.out.println("The duck is flying");
    }
}
