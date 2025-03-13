package dsa.java8.funinterface;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Operation addition = (a, b) -> a +b;
        Operation subtraction = (a, b) -> a -b;

        System.out.println(addition.operation(10, 20));
        System.out.println(subtraction.operation(30, 10));
    }
}

