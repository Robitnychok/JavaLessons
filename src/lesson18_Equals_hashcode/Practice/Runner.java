package lesson18_Equals_hashcode.Practice;

public class Runner {
    public static void main(String[] args) {

        User user1 = new User ( "Ablazzing" , "11111");
        User user2 = new User ( "Ablazzing" , "22222");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1.equals(user2));

    }
}
