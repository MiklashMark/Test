package org.example.servletsTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/getSum")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        int firstParam = Integer.parseInt(req.getParameter("firstParam"));
        int secondParam = Integer.parseInt(req.getParameter("secondParam"));
        int thirdParam = Integer.parseInt(req.getParameter("thirdParam"));

        var writer = resp.getWriter();
        writer.println("<h1>" + firstParam + secondParam + thirdParam + "<h1>");
    }
}
