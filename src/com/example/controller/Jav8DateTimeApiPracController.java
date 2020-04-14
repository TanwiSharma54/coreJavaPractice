package com.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Jav8DateTimeApiPracController", urlPatterns = {"/Jav8DateTimeApiPracController"})
public class Jav8DateTimeApiPracController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>Hello World!</TITLE>"+
                "</HEAD><BODY>Hello World!</BODY></HTML>");
        out.close();
    }
}
