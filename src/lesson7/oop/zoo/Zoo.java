package lesson7.oop.zoo;

import lesson7.oop.Cat;
import lesson7.oop.setterGetter.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed(){
        cat.feed("fish", "milk");
        dog.feed("meat" , "water");
    }
}
