package lesson25_Block_Final;

public class Excaption_example {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Do not divide on zero ");
        } finally {
            System.out.println("Cont");
        }
    }
}
