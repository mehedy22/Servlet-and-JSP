package com.apachekafka.servletjsp.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;

public class AddServlet extends HttpServlet {
    // This two object is created by tomcat HttpServletRequest and HttpServletResponse
/*    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("first"));
        int j = Integer.parseInt(request.getParameter("second"));

        int sum = i + j;

        // WE wanna called the Square Servlet  from this servlet by  using Request Dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("/square");
        rd.forward(request,response);

    }*/
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int sum = i + j;
        // Sending or Working with Tomcat Session Management

        HttpSession session=request.getSession();
        session.setAttribute("sum",sum);
        response.sendRedirect("square?sum=" + sum);
     /*   request.setAttribute("sum",sum);

        // WE wanna called the Square Servlet  from this servlet by  using Request Dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("square");
        rd.forward(request,response);*/

    }
}
