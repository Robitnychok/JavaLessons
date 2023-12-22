package lesson7.oop.setterGetter;

import java.util.Arrays;

public class Dog {

    private String name = "bob";
    private int age = 12;

    {
        System.out.println("The dog was born");
    }

    public Dog(){

    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName (String nameDog){
        if (nameDog.isEmpty()){
            System.out.println("Use the name");
        } else {
            name = nameDog;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge ( int ageDog){
        if (ageDog<0){
            System.out.println("use correct age");
        } else{
            age = ageDog;
        }
    }
    public int getAge(){
        return age;
    }

    public void feed (String ... product){
        System.out.printf("The dog ate %s", Arrays.toString(product));
    }
}
