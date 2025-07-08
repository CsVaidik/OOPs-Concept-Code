package Basics_01;

class Human{
    String name;
    int age ;
    long mob_no;

    Human(){
        this.name = "Uk";
        this.age = 0;
        this.mob_no = 0;
    }

    Human(String name){
        this.name = name;
        this.age = 21;
        this.mob_no = 8978645345L;
    }
    Human(String name,int age){
        this.name = name;
        this.age = age;
        this.mob_no = 9978645345L;
    }
    Human(String name,int age,long mob_no){
        this.name = name;
        this.age = age;
        this.mob_no = 8978645345L;
    }

    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nmob_no: "+mob_no);
        System.out.println("---------------------------------------");
    }


}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Human p1 = new Human();
        Human p2 = new Human("Vaidik");
        Human p3 = new Human("Yatesh",56);
        Human p4 = new Human("PrathAM",79,9675807634L);
        p1.display();
        p2.display();
        p3.display();
        p4.display();


    }
}
