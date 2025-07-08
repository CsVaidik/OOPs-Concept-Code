package Basics_01;


class car {
    String color;
    String model;
    int speed;

    void drive(){
        System.out.println("The " + color + " " + model + " is driving at " + speed + " km/h.");
    }
}

public class ClassAndObjectDemo {

    public static void main(String[] args){
        //Creating and object
        car myCar = new car();
        myCar.color = "Red";
        myCar.model = "Benz";
        myCar.speed = 120;

        myCar.drive();

    }

}
