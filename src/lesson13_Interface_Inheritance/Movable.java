package lesson13_Interface_Inheritance;

public interface Movable {

    default void move(){
        System.out.println("Smth moves");
    };
}
