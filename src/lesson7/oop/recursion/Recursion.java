package lesson7.oop.recursion;

public class Recursion {

    public int sum (int number){
        if (number>0){
            return 1;
        }
        int result = number+(number-1);
        return 0;
    }
}
