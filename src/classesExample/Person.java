package classesExample;

public class Person {

    private String name;
    private String surname;
    private int age = 0;

    Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void happyBirthad (){
        age++;
        System.out.printf("%s %s has birthday today. He is %d y.o.\n",name,surname,age);
    }
}
