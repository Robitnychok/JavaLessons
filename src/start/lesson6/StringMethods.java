package start.lesson6;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello world!";

        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String textLowerCase = text.toLowerCase();
        System.out.println(textLowerCase);

        int length = text.length();
        System.out.println(length);

        boolean contains = text.contains("Hello");
        System.out.println(contains);

        String stringReplace = text.replaceAll("l", "p");
        System.out.println(stringReplace);

        String repeated = text.repeat(10);
        System.out.println(repeated);
        
        String names = "Sonya; Vika; Vitalij";
        String [] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        boolean srartsWithHel = text.startsWith("Hel");
        System.out.println(srartsWithHel);



    }
}
