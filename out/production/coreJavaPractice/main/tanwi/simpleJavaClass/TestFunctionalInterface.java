package tanwi.simpleJavaClass;

public class TestFunctionalInterface {
    public static void main(String args[]) {
        MyFirstFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.twoNumbers(12, 100));

    }
}
