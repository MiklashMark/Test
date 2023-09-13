package org.example.servletsTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/currentDirectory")
public class DirOpeningServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.setContentType("text/plain; charset=utf-8");
        resp.setHeader("MY_HEADER","1");
        File currentDirectory = new File(".");

        File[] currentDirectoryFiles = currentDirectory.listFiles();

        PrintWriter printWriter = resp.getWriter();
        printWriter.write(Arrays.toString(currentDirectoryFiles));

        String header = req.getHeader("user-agent");

        printWriter.println("<h1>" + header + "</h1>");
    }
}
