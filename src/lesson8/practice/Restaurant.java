package lesson8.practice;

public class Restaurant {

    private static int sausages = 0;
    private static int bread = 0;


    public  void dish(){
        int new_sausages = sausages - 1;
        int new_bread = bread -2;
        if (this.sausages <= 0 && bread < 1) {
            System.out.println("Do not have ingredients");
        } else {
            System.out.println("Hot dog is ready");
        }

    }
    public void receiveIngr (){
        sausages += 100;
        bread += 200;
    }

}
