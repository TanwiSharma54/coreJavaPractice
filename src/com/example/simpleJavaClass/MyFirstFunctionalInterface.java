package com.example.simpleJavaClass;;
@FunctionalInterface
public interface MyFirstFunctionalInterface {
    public int twoNumbers(int a, int b);
    default void displayDefault(){
        System.out.println("calling functional interface default method");
    }
    static void displayStatic() {
        System.out.println("calling functional interface static method");
    }
}
