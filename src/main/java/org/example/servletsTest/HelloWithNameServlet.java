package org.example.servletsTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello_with_name")
public class HelloWithNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        String firstName = req.getParameter("firstName");
        String lastname = req.getParameter("lastName");

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Hello" + firstName +  " " + lastname);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var printWriter = resp.getWriter();

        printWriter.println("<h1>" + req.getParameter("login") + "<h1>");
        printWriter.println("<h1>" + req.getParameter("psw") + "<h1>");
    }
}
