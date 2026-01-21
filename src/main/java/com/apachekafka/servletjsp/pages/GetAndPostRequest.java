package com.apachekafka.servletjsp.pages;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GetAndPostRequest extends HttpServlet {

//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("first"));
//        int j = Integer.parseInt(request.getParameter("second"));
//
//        int sum = i + j;
//        PrintWriter out = response.getWriter();
//        out.println(sum);
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        int i = Integer.parseInt(request.getParameter("first"));
//        int j = Integer.parseInt(request.getParameter("second"));

        // WE wanna called the Square Servlet  from this servlet by  using Request Dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("/square");
        rd.forward(request,response);
    }
}
