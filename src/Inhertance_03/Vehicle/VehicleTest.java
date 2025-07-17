package Inhertance_03.Vehicle;

public class VehicleTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Honda";
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.brand = "Yamaha";
        bike.start();
        bike.ride();
        bike.stop();
    }
}
