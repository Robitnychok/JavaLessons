package start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        // bought bread
        boolean isBoughtBread = true;

        // bought milk
        boolean isBoughtMilk = true;

        // bought bread and milk
        boolean isBoughtBreadAndMilk = isBoughtMilk && isBoughtMilk;
        //boolean isBoughtBreadAndMilk = true && true;


        if(isBoughtBreadAndMilk){
            System.out.println("Well done, we have bread and milk");
        } else if (isBoughtBread){
            System.out.println("We have bread");
        } else if (isBoughtMilk) {
            System.out.println("we have milk");
        } else {
            System.out.println("we don`t have anything");
        }

        boolean isBoughtBreadOrMilk = true || true;
        //boolean  isBoughtBreadOrMilk = true;
        //boolean  isBoughtBreadOrMilk = true || false;
        //boolean  isBoughtBreadOrMilk = true;
        //boolean  isBoughtBreadOrMilk = false || false;
        //boolean  isBoughtBreadOrMilk = false ;


        // bought sweet or NOT
        boolean isBoughtCandy = false;

        if(!isBoughtCandy){
            System.out.println("good");
        }

        // do not do this, bc we have easier way
//        if (isBoughtCandy){
//
//        } else {
//            System.out.println("good");
//        }
    }
}
