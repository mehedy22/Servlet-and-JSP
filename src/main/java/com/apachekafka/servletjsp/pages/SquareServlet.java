package com.apachekafka.servletjsp.pages;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

   /*     int k = Integer.parseInt(request.getParameter("sum"));
        k = k * k;

        PrintWriter out = response.getWriter();
        out.println("Result is : " + k + "");*/

        // Receiving Through Session

        HttpSession session = request.getSession();
        int k = (int) session.getAttribute("sum");
        k = k * k;

        PrintWriter out = response.getWriter();
        out.println("Result is : " + k + "");

    }
}
