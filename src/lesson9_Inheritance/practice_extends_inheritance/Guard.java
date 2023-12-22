package lesson9_Inheritance.practice_extends_inheritance;

public class Guard extends Profession{
    public static int guardSalary = 15000;

    @Override
    public void work (){
        System.out.println("The guard - guards ");
    }

    /*@Override
    public void receiveSalary (){
        System.out.println("The salary is " + guardSalary);
    }*/
}
