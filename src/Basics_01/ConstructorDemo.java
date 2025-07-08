package Basics_01;

class Student {
    String name;

    //Constructor
    Student(String n){
        name = n ;

    }

    void show(){
        System.out.println("Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Vaidik");
        s1.show();
    }
}
