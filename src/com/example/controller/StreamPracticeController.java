package com.example.controller;

import com.example.simpleJavaClass.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
        myList.sort(Comparator.comparing(Employee::getFirstName));
        String msg = "Hi It is working fine";
        //request.setAttribute("myListOfEmplyee", msg);
        //String url = "/index.jsp";
        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        //dispatcher.forward(request, response);
        response.setContentType("text/html");
             PrintWriter out = response.getWriter();
            out.println("<HTML><HEAD><TITLE>Hello World!</TITLE>"+
                    "</HEAD><BODY>Hello World!</BODY></HTML>");
            out.close();
    }

}
