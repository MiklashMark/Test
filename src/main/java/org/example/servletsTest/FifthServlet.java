package org.example.servletsTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/fifthServlet")
public class FifthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        String parameterName = "firstName";

        var print = resp.getWriter();

        String[] parameters = req.getParameterMap().get(parameterName);

        if (parameters != null) {
            for (String s : parameters) {
                print.println(s);
            }
        }
    }
}
