package lesson7.oop.setterGetter;

public class RunnerDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();


        dog1.setName("gui");
        System.out.println(dog1.getName());

        dog1.setAge(3);
        System.out.println(dog1.getAge());

        Dog dog2 = new Dog("iug", 15);
        System.out.println(dog2.getName()+dog2.getAge());



    }
}
