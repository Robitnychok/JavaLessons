package lesson11_Interfaces.example_by_Alishev;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal(1);
        Person person = new Person("Bob");

        animal.sleep();
        person.sayHello();



        showInf(animal);
        showInf(person);
    }

    static void showInf(Info info) {
        info.showInfo();
    }
}
