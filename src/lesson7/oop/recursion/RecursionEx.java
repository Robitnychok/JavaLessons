package lesson7.oop.recursion;

public class RecursionEx {
    public static void main(String[] args) {

        int k = 10;
        //count from 0 to k

        Recursion recursion = new Recursion();
        int result = recursion.sum(k);
        System.out.println(result);


    }
}
