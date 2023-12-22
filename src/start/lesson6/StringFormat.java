package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Sofia";
        int age = 31;

        // String phrase = "My name is " + name+"my age is "+age;

        String phrase = String.format("My name is %s" , name);

        System.out.println(phrase);
    }
}
