package com.wuzhixin.week2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Hello extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Name: Your Name</h2>");
        out.println("<h2>ID: Your Student ID</h2>");
        out.println("<h2>Date and Time: " + new Date().toString() + "</h2>");
        out.println("</body></html>");
    }
    public void  doPost( HttpServletRequest request, HttpServletResponse response ) throws IOException {
        System.out.println("doPost");

    }

    //public void destroy() {
    //}
}