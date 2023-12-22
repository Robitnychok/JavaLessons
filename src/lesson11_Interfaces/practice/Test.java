package lesson11_Interfaces.practice;

public class Test {
    public static void main(String[] args) {

        Duck duck = new Duck();
        Fish fish = new Fish();
        Plain plain = new Plain();

        Swimming [] swimmingPool = {duck, fish};
        Flying [] sky = {duck, plain};

        for (Swimming swimmingPool1 : swimmingPool){
            swimmingPool1.swim();
        }

        for (Flying sky1 : sky){
            sky1.fly();
        }
    }


}
