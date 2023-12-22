package lesson23_Nested_classes;

public class Ranner {
    public static void main(String[] args) {

        Human human = new Human("1","554OIN", PassType.FOREIN);

        System.out.println(human);

        Human.Pass pass = new Human.Pass("1","554OIN", PassType.FOREIN);

        Human.Heart heart = human.new Heart(288.5);

    }
}
