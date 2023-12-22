package lesson24_Record;

public class Record_Runner {
    public static void main(String[] args) {

        Human human = new Human(1999, "Sofia", "Rudenko");
        System.out.println(human);


        New_Human_Record newHumanRecord = new New_Human_Record(1999, "Sofia", "Rudenko");
        System.out.println(newHumanRecord);

    }
}
