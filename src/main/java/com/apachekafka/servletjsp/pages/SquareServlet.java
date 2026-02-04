package com.apachekafka.servletjsp.pages;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "squareServlet", value = "/square")
public class SquareServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

   /*     int k = Integer.parseInt(request.getParameter("sum"));
        k = k * k;

        PrintWriter out = response.getWriter();
        out.println("Result is : " + k + "");*/

        // Receiving Through Session
/*
        HttpSession session = request.getSession();
        int k = (int) session.getAttribute("sum");
        k = k * k;*/

        // Extract the Cookies from Request Object
        // Receiving Through Cookies
        int k = 0;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("sum")) {
                k = Integer.parseInt(cookie.getValue());
            }
        }

        k = k * k;


        PrintWriter out = response.getWriter();
        out.println("Result is : " + k + "");

    }
}
