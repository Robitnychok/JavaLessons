package lesson11_Interfaces.example_by_Alishev;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void showInfo (){
        System.out.println("My name is "+ name);
    }
}
