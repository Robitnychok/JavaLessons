package lesson9_Inheritance;


import lesson9_Inheritance.dogs.Bigl;
import lesson9_Inheritance.dogs.Labrador;
import lesson9_Inheritance.protectd_dog.Poodle;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Info about Poodle");
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breath();
        System.out.println(poodle.countTeeth);
        poodle.beAngry();

        System.out.println("\n Info about Bigl");
        Bigl bigl = new Bigl();
        bigl.bark();
        bigl.run();
        bigl.breath();
        System.out.println(bigl.countTeeth);
        bigl.beAngry();

        System.out.println("\n Info about Labrador");
        Labrador labrador = new Labrador();
        labrador.bark();
        labrador.run();
        labrador.breath();
        System.out.println(labrador.countTeeth);
        labrador.beAngry();


    }
}
