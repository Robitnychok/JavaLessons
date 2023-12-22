package lesson8.practice_setter_getter;



public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Nisan");
        Car car1 = new Car("BMW", 1000);

        car.setBrand("ZvorCar");
        car1.setBrand("SuperCar");
        car1.setSpeed(400);

        car.racingTo_100();
        car1.racingTo_100();

        Garage garage = new Garage();
        garage.setCar(car);
        garage.setCar2(car1);
        garage.infMethod();




    }
}
