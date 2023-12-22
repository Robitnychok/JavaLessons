package start.lesson5;

public class ForPractise {
    public static void main(String[] args) {
        //print all even numbers from the array - numbers

        int [] numbers = {3, 2, 5, 10, 8, 3};

        for (int evenNumber : numbers){
            if (evenNumber %2 ==0){
                System.out.println(evenNumber);
            }
        }
        System.out.println("___________________");

        // print all numbers under even indexes from the array - numbers

        for (int i = 0; i < numbers.length ; i++) {
            if (i % 2 ==0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
