package lesson9_Inheritance.dogs;

public class Labrador extends Dog {

    public Labrador (){
        super (27);
    }
    @Override
    public void breath() {
        System.out.println("The dog is breathing hard");
    }

    @Override
    public void run() {
        System.out.println("The dog is running hard");
    }

    public void bark (){
        System.out.println("The labrador is barking");
    }

}
