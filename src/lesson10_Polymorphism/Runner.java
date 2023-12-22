package lesson10_Polymorphism;

public class Runner {
    public static void main(String[] args) {

        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();
        Animal dog4 = new Dog();
        Animal dog5 = new Dog();
        Animal dog6 = new Dog();
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal cat3 = new Cat();
        Animal cat4 = new Cat();
        Animal cat5 = new Cat();
        Animal cat6 = new Cat();

        Animal[] animals = new Animal[]{
                dog1,
                dog2,
                dog3,
                dog4,
                dog5,
                dog6,
                cat1,
                cat2,
                cat3,
                cat4,
                cat5,
                cat6
        };

        for (int i = 0; i < animals.length; i++) {
            animalIsEating(animals[i]);
        }


    }


    static void animalIsEating(Animal animal) {
        animal.eat();
    }
}
