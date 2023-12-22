package start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double carPrice = 15_0000.00;
        boolean hasAutomaticTransmission = false;

/*        String phrase = String.format("Hi, I am a manager of %s salon\n We have a model of the car %s with a price %d \n Do you have an automatic transmission? \n ", carMark, carModel, carPrice);
        System.out.println(phrase);
        System.out.println(hasAutomaticTransmission ? "yes" : "no");    */

        String textBlock = """
                hi i am a manager of %s salon
                we have a model of the car %s with a price %f
                Does it have an AutomaticTransmission?
                %s
                """.formatted(carMark, carModel, carPrice, hasAutomaticTransmission ? "yes" : "no");

        System.out.println(textBlock);

    }
}
