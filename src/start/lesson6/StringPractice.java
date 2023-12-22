package start.lesson6;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String text = "my name is Sofia";

        // choose text from 11 symbol till the end , do lower case

        String textFromElevenTillTheEnd = text.substring(11, text.length()).toLowerCase();
        System.out.println(textFromElevenTillTheEnd);

        // cut the string text under gap (space) . find the lengs of the string

        String [] worldsInArray =text.split(" ");
        System.out.println(Arrays.toString(worldsInArray));

        int lengthOfTheString = text.length();
        System.out.println(lengthOfTheString);



    }
}
