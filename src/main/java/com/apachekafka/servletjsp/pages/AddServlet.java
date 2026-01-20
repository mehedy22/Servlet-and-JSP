package com.apachekafka.servletjsp.pages;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    // This two object is created by tomcat HttpServletRequest and HttpServletResponse
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("first"));
        int j = Integer.parseInt(request.getParameter("second"));

        int sum = i + j;
        PrintWriter out = response.getWriter();
        out.println(sum);
    }
}
