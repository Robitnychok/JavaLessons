package lesson26_Input_Output;

public class Calculator {

    public int makeOperation (int number1, int number2, String operationSign){
        if (operationSign.equals("+")){
            return sum(number1,number2);
        }
        throw new UnsupportedOperationException("This operation do not exist");
    }

    private int sum (int number1, int number2){
         int sum=  number1+number2;
         return sum;
    }
}


