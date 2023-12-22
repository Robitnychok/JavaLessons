package lesson9_Inheritance.practice_extends_inheritance;

public abstract class Profession {

    public abstract void work ();

    public void receiveSalary(int salary) {

        System.out.println("The salary is " + salary);
    }

    public String sexWoman = "Woman";
    public String sexMan = "Man";

}
