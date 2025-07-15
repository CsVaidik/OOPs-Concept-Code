package Inhertance_03.Animal;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Sheru";

        dog.sleep();
        dog.eat();
        dog.barks();

        Cat cat = new Cat();
        cat.name = "rupa";

        cat.meow();
        cat.eat();
        cat.sleep();


    }

}
