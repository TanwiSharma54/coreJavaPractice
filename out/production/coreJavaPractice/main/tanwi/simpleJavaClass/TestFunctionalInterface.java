package tanwi.simpleJavaClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestFunctionalInterface {
    public static void main(String args[]) {
        MyFirstFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.twoNumbers(12, 100));

        List<Employee> myList = new ArrayList<>();
        Employee emp1 = new Employee(13,"Vivan", "Sharma");
        Employee emp2 = new Employee(1,"Xavir", "Alli");
        Employee emp3 = new Employee(533,"Aman", "Gupta");
        Employee emp4 = new Employee(3,"Raghav", "Sodi");
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        for(Employee emp : myList){
           System.out.print(emp.getEmpId());
            System.out.print("|");
            System.out.print(emp.getFirstName());
            System.out.print("|");
            System.out.println(emp.getLastname());
        }

        //implementing java8 forEach method
        System.out.println("Implementing forEach Method");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print("|");
            System.out.print(Employee.getFirstName());
            System.out.print("|");
            System.out.println(Employee.getLastname());
        });

        //implementing comparable<Employee> interface function compareTo(Employee emp)
        Collections.sort(myList);
        //implementing comparable Interface
        System.out.println("Implementing comparable Interface");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print("|");
            System.out.print(Employee.getFirstName());
            System.out.print("|");
            System.out.println(Employee.getLastname());
        });

    }
}
