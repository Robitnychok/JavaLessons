package start.lesson5;

public class Continue {
    public static void main(String[] args) {
        int [] numbers = { 1, 3, 6, 4, 5};

        for (int result : numbers){
            if (result == 6){
                continue;
            }
            System.out.println("Do it");
        }
    }
}
