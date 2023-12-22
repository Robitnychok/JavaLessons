package lesson9_Inheritance.practice_extends_inheritance;

public class Accountant extends Office_worker{

    public static int accountantSalary = 50000;

    @Override
    public void work (){
        System.out.println("The accountant - counts taxes ");
    }

   /* @Override
    public void receiveSalary (){
        System.out.println("The salary is " + accountantSalary);
    }*/

  }
