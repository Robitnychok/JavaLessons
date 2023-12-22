package start.lesson6;

import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String text = "Vitalik Sonya Tgr";

        String[] splitNames = text.split(" ");
        System.out.println(Arrays.toString(splitNames));


    }
}
