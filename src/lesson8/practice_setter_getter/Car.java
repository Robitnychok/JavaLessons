package lesson8.practice_setter_getter;

public class Car {

    private String brand;
    private int maxSpeed = 220;
    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public Car(String brand){
        this.brand = brand;
    }

    public void racingTo_100 () {
        double racingTo_100 = 110d/ (this.maxSpeed /20d);
        System.out.println("Time for racing to 100 km: " + racingTo_100);
    }

    public void setBrand (String setBrand){
        brand = setBrand;
    }

    public String getBrand(){
        return brand;
    }

    public void setSpeed (int setSpeed){
        maxSpeed = setSpeed;
    }
    public int getSpeed(){
        return maxSpeed;
    }
}
