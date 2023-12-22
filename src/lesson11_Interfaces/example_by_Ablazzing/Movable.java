package lesson11_Interfaces.example_by_Ablazzing;

public interface Movable {

    public void move ();

    default public void abc (){
        System.out.println("F it");
    }
}
