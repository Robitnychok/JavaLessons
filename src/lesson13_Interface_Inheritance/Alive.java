package lesson13_Interface_Inheritance;

public interface Alive extends Eatable, Movable {
    @Override
    default void move() {
        Eatable.super.move();
    }
}
