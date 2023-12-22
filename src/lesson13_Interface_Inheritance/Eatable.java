package lesson13_Interface_Inheritance;

public interface Eatable {

    void eat ();

    default void move(){
        System.out.println("Smbd moves");
    };
}
