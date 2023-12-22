package lesson9_Inheritance.dogs;

public class Bigl extends Dog {

    public Bigl (){
        super (36);
    }

    public void run (){
        System.out.println(" The dog is running fastly");
    }

    @Override
    public void breath() {
        System.out.println("The dog is breathing fastly");
    }
}
