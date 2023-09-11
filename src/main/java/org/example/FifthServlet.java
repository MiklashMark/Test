package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/fifthServlet")
public class FifthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        String parameterName = "firstName";

        var print = resp.getWriter();

        String[] parametersNames = req.getParameterMap().get(parameterName);
        print.println(Arrays.toString(parametersNames));


    }
}
