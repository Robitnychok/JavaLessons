package lesson9_Inheritance.practice_extends_inheritance;

public class Runner {
    public static void main(String[] args) {

        Guard guard = new Guard();
        guard.work();
        guard.receiveSalary(15000);
        System.out.println( guard.sexMan );

        Accountant accountant = new Accountant();
        accountant.work();
        accountant.drinkCoffee();
        accountant.receiveSalary(50);
        System.out.println( accountant.sexWoman );

        Secretary secretary = new Secretary();
        secretary.work();
        secretary.drinkCoffee();
        secretary.receiveSalary(15000);
        System.out.println( secretary.sexWoman);

    }
}
