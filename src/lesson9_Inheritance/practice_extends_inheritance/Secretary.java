package lesson9_Inheritance.practice_extends_inheritance;

public class Secretary extends Office_worker {

    public static int secretarySalary = 30000;

    @Override
    public void work (){
        System.out.println("The secretary - prints documents");
    }

    /*@Override
    public void receiveSalary() {
        System.out.println("The salary is " + secretarySalary);
    }*/
}
