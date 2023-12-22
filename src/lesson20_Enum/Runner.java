package lesson20_Enum;

import start.lesson5.Array;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        System.out.println(Country.ARGENTINA);
        System.out.println(Country.GREECE );
        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("GREECE").getLanguage());

    }

    public static CountryOLD[] getCountry (){
        CountryOLD[] country = new CountryOLD[3];
        country[0] = new CountryOLD("Japan", 140_000_000L, "Japanese");
        country[1] = new CountryOLD("Greece", 10_000_000L, "Greece");
        country[2] = new CountryOLD("Argentina", 47_000_000L, "Spanish");
        return country;
    }
}
