package com.example.simpleJavaClass;

import java.util.Comparator;

public class Employee {
    private int empId;
    private String firstName;
    private String lastname;

    public Employee(int empId, String firstName, String lastname) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    //All the above implementations of Comparator interface are anonymous classes.
    //https://www.journaldev.com/996/java-inner-class
    public static Comparator<Employee> EmployeeIdComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getEmpId()-(e2.getEmpId());
        }
    };
    public static Comparator<Employee> EmployeeFirstNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };
    public static Comparator<Employee> LastNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    };

}
