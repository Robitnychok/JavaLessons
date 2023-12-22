package start.lesson4;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isWorkWheel1 = true;
        boolean isWorkWheel2 = false;
        boolean isWorkWheel3 = false;
        boolean isWorkWheel4 = true;
        int countWheels = 0;
        countWheels += isWorkWheel1 ? 1 :0;
        countWheels += isWorkWheel2 ? 1 :0;
        countWheels += isWorkWheel3 ? 1 :0;
        countWheels += isWorkWheel4 ? 1 :0;

        if (isWorkEngine && isWorkTransmission && (countWheels>=3)) {
            System.out.println("Car is ready");
        } else {
            System.out.println("car is not ready");
        }
    }
}
