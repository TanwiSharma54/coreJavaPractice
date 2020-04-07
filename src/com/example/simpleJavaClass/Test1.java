package com.example.simpleJavaClass;;

public class Test1 implements MyFirstFunctionalInterface{
    @Override
    public int twoNumbers(int a, int b){
        return a + b;
    }
    public static void main(String args[]){
        Test1 test = new Test1();
        System.out.println(test.twoNumbers(10,78));
        test.displayDefault();
        MyFirstFunctionalInterface.displayStatic();
    }
}
