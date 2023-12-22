package lesson26_Input_Output;

import java.util.Scanner;

public class Input_example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Writhe 1 number");
        int numb1 = scanner.nextInt();


        System.out.println("Writhe operation");
        String operation = scanner.next();

        System.out.println("Writhe 2 number");
        int numb2 = scanner.nextInt();

        System.out.println(calculator.makeOperation(numb1,numb2,operation));
    }
}
