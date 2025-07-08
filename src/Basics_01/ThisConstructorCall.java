package Basics_01;

class Employee{

    String name;
    int salary;

    //parametrized Constructor
    Employee(){
        this("Unknown",0);
    }
    Employee(String name,int salary){
        this.name = name;
        this.salary= salary;
    }

    void display(){
        System.out.println("Name : "+name+", Salary : "+salary);
    }

}

public class ThisConstructorCall{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Vaidik",50000);
        e1.display();
        e2.display();
    }

}
