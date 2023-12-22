package lesson11_Interfaces.example_by_Ablazzing;

public class Dog implements Movable {

    public void move (){
        System.out.println("Dog is running");
    }

    @Override
    public void abc() {
        System.out.println("F it it ");
    }
}
