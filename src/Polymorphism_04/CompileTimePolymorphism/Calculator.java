package Polymorphism_04.CompileTimePolymorphism;


public class Calculator {

    // Add 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Add 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add 2 doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add 1 int + 1 double (different order)
    double add(int a, double b) {
        return a + b;
    }

    // Add 1 double + 1 int (different order)
    double add(double a, int b) {
        return a + b;
    }
}