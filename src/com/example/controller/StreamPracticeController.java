package com.example.controller;

import com.example.simpleJavaClass.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@WebServlet(name = "StreamPracticeController", urlPatterns = {"/StreamPracticeController"})
public class StreamPracticeController extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        List<Employee> myList = new ArrayList<>();
        Employee emp1 = new Employee(13,"Vivan", "Sharma");
        Employee emp2 = new Employee(1,"Xavir", "Alli");
        Employee emp3 = new Employee(533,"Aman", "Gupta");
        Employee emp4 = new Employee(3,"Raghav", "Sodi");
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        String st = "hello";
        //comparable interface
        myList.sort((empL1, empL2)-> empL1.getFirstName().compareTo(empL2.getFirstName()));
        System.out.println("Sort by employee First Name");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print("|");
            System.out.print(Employee.getFirstName());
            System.out.print("|");
            System.out.println(Employee.getLastname());
        });

        //comparator interface using lambda expression
        myList.sort(Comparator.comparing(employee -> employee.getLastname()));
        System.out.println("Sort by employee Last Name");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print("|");
            System.out.print(Employee.getFirstName());
            System.out.print("|");
            System.out.println(Employee.getLastname());
        });

        //comparator using method reference
        myList.sort(Comparator.comparing(Employee::getEmpId));
        System.out.println("Sort by employee id");
        myList.forEach(Employee -> {
            System.out.print(Employee.getEmpId());
            System.out.print("|");
            System.out.print(Employee.getFirstName());
            System.out.print("|");
            System.out.println(Employee.getLastname());
        });
        request.setAttribute("myListOfEmplyee", myList);
        String url = "/StreamResult.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
