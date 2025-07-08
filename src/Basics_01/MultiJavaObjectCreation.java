package Basics_01;

class Animal {
    String name;
    void sound(){
        System.out.println(name + " makes a sound. ");
    }
}

public class MultiJavaObjectCreation {
    public static void main(String[] args){
        Animal dog = new Animal();
        dog.name = "Dog";
        dog.sound();

        Animal cat = new Animal();
        cat.name = "Cat";
        cat.sound();

    }
}
