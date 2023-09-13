package org.example.servletsTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/fourthServlet")
public class FourthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/plain;charset=utf-8");
      PrintWriter print = resp.getWriter();
      
      Map<String, String[]> argumentsMap = req.getParameterMap();

        for (Map.Entry<String, String[]> m : argumentsMap.entrySet()) {
            print.println("Argument : " + m.getKey());
            for (String v : m.getValue()) {
                print.println(v);
            }
        }
      
    }
}
