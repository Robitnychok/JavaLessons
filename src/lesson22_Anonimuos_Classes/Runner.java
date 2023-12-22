package lesson22_Anonimuos_Classes;

public class Runner {
    public static void main(String[] args) {

        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("www");
            }

            @Override
            public void breath() {
                System.out.println("qqq");
            }
        };
dog.eat();
dog.breath();

        Happy cat = new Happy() {
            @Override
            public void smile() {
                System.out.println("eee");
            }
        };
        cat.smile();
    }}

