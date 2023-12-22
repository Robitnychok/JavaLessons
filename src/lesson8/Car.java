package lesson8;

public class Car {
    private String brand;
    public static int countCars = 0;
    public final static String BMW_INFO = "BMW is a German company, based on 1928";
    public final static String AUDI_INFO = "Audi is a German company, based on 1933";
    public final static String KIA_INFO = "Kia is a Korean company, based on 1962";

    public final static String [] BRANDS_DESCRIPTIONS = new String [3];

    static {
        BRANDS_DESCRIPTIONS [0] = BMW_INFO;
        BRANDS_DESCRIPTIONS [1] = AUDI_INFO;
        BRANDS_DESCRIPTIONS [2] = KIA_INFO;
    }

    public Car (String brand){
        this.brand = brand;
        countCars++;
    }

    public int getCountCars (){
        return countCars;
    }

    public static void printBrands (){
        System.out.println("The list of available brands: audi, bmw, kia");
    }

}
