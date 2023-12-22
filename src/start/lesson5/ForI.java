package start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int [] array = {1 ,2 ,3, 4};
        for (int i = 0; i < 3;  i++) {
            System.out.println(array[i]);
        }
        System.out.println("________________________________");

        //print even numbers

        int [] numbers2 = {3, 2, 10, 5, 8};
        for (int evenNumber : numbers2){
            if ( evenNumber % 2 ==0){
                System.out.println(evenNumber);
            }
        }



    }
}
