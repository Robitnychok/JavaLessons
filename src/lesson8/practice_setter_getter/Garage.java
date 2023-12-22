package lesson8.practice_setter_getter;


public class Garage {
    private Car car;
    private Car car2;

    public Garage ( ){
    }

    public void setCar (Car car){
        this.car= car;
    }

    public void setCar2 ( Car car2){
        this.car2 = car2;
    }

    public void infMethod (){
        getInfoAboutCar(car);
        getInfoAboutCar(car2);
    }

    private void getInfoAboutCar (Car car){
        System.out.println(car.getBrand());
        car.racingTo_100();
    }

}
