package ru.academit.ilnitsky;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Первый сервлет
 * Created by Mike on 04.07.2017.
 */
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = -1933001739965631005L;
    private String message;

    public void init() throws ServletException {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }

    public void destroy(){}
}
