package lesson16_Operator_instanceof.Interface_Marker;

public class Runner {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Plane plane = new Plane();

        if (bird instanceof Alive){
            System.out.println("It is alive");
        }

        if (plane instanceof Alive){
            System.out.println("It is alive");
        } else {
            System.out.println("It is not alive");
        }
    }

}
