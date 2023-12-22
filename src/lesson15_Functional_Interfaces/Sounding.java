package lesson15_Functional_Interfaces;
@FunctionalInterface
public interface Sounding {
    void makeSound ();
    default void doSmth(){
        System.out.println("doing");
    }
}
