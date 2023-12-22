package start.lesson4;

public class Switch {
    public static void main(String[] args) {

        // 1 is Monday ... 2 is Tuesday

        int dayNumber = 5;

        switch (dayNumber){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("thursday");
                break;
            default :
                System.out.println("not exist");
                break;
        }
    }
}
