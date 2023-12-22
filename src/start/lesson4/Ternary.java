package start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 60;
        int moneyAfterPurchase = money - breadPrice;
        int moneyLeft = moneyAfterPurchase >= 50 ? 10 : 5;
        moneyAfterPurchase = moneyAfterPurchase >= 50 ? 10 : 5;

        System.out.println(moneyLeft);

//        if (moneyAfterPurchase >= 50){
//            moneyLeft = 10;
//        } else{
//            moneyLeft = 5;
//        }


    }
}
