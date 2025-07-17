package Polymorphism_04.CompileTimePolymorphism;


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(2, 3): " + calc.add(2, 3));
        System.out.println("add(1, 2, 3): " + calc.add(1, 2, 3));
        System.out.println("add(4.5, 3.2): " + calc.add(4.5, 3.2));
        System.out.println("add(5, 6.3): " + calc.add(5, 6.3));
        System.out.println("add(3.5, 2): " + calc.add(3.5, 2));
    }
}