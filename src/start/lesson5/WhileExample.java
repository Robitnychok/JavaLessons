package start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while(count<10){
            count++;
            System.out.println(count);
        }
        System.out.println("End of While");

        while(true){
            count++;
            System.out.println(count);
            if (count == 25){
                break;
            }
        }
        System.out.println("End of While2");

    }
}
