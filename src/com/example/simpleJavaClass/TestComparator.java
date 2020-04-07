package com.example.simpleJavaClass;;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String args[]) {
        List<Employee> myList = new ArrayList<>();
        Employee emp1 = new Employee(13,"Vivan", "Sharma");
        Employee emp2 = new Employee(1,"Xavir", "Alli");
        Employee emp3 = new Employee(533,"Aman", "Gupta");
        Employee emp4 = new Employee(3,"Raghav", "Sodi");
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        //sort by employee id
        Collections.sort(myList, Employee.EmployeeIdComparator);

        System.out.println("Sort by employee id");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print(Employee.getFirstName());
            System.out.println(Employee.getLastname());
        });

        //sort by employee first name
        Collections.sort(myList, Employee.EmployeeFirstNameComparator);
        System.out.println("Sort by employee first name");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print(Employee.getFirstName());
            System.out.println(Employee.getLastname());
        });

        //sort by employee Last name
        Collections.sort(myList, Employee.LastNameComparator);
        System.out.println("Sort by employee Last name");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print(Employee.getFirstName());
            System.out.println(Employee.getLastname());
        });
    }
}
