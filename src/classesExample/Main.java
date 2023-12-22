package classesExample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vitalik", "Rudenko");
        Person person2 = new Person("Sonya", "Rudenko");

        for (int i = 0; i < 23; i++) {
            person.happyBirthad();
        }

        for (int i = 0; i < 24; i++) {
            person2.happyBirthad();
        }

    }
}
