package lesson12_Dependency_Inversion;

public class Runner {
    public static void main(String[] args) {

        Bigl bigl = new Bigl();
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();

        DogZoo dogZoo = new DogZoo(shepherd , poodle);
        DogZoo dogZoo1 = new DogZoo(bigl, poodle);


    }
}
