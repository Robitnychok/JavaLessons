package lesson11_Interfaces.example_by_Ablazzing;

public class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        Dog dog = new Dog();

        Movable[] movables = new Movable[2];
        movables [0] = car;
        movables [1] = dog;

        for (Movable movable : movables){
            movable.move();
            movable.abc();
        }

    }
}
