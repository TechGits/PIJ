package org.example;

public class Greeter {
    public static void main(String[] args) {
        DoubleNumberFunction doubleNumberFunction = (int a) -> a * 2;
        int result = doubleNumberFunction.adder(2); // In this case, a =  2.
        System.out.println("Eesult: "+result);
    }
}
