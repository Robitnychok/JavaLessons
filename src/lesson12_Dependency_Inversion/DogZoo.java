package lesson12_Dependency_Inversion;

public class DogZoo {

    private Dog dog1;
    private Dog dog2;

    public DogZoo (Dog dog1, Dog dog2){
        System.out.println("Constructor for 2 random dogs");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public DogZoo (Bigl bigl, Poodle poodle){
        System.out.println("Constructor for bigl and poodle");
        this.dog1 = bigl;
        this.dog2 = poodle;
    }
}
