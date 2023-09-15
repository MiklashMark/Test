package org.example.vote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Map;

@WebServlet("/vote")
public class VoteServlet extends HttpServlet {
   private Statistics statistics = new Statistics();

    @Override
    public void init() {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        var print = resp.getWriter();

        String[] genresVote = req.getParameterValues("genre");
        if (genresVote.length < 3) {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");

            print.println("<html><body>");
            print.println("<h1>Ошибка! Выберите от 3-х жанров!</h1>");
            print.println("</body></html>");
        } else {
            String artistVote = req.getParameter("bestArtist");
            statistics.addUsersArtistVote(artistVote);
            statistics.addUsersGenresVote(genresVote);

            String usersInformation = req.getParameter("aboutMe");
            statistics.addUsersInformation(usersInformation);

            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            print = resp.getWriter();

            print.println("<html><body>");
            print.println("<h1>Спасибо за ваш голос и информацию!</h1>");
            print.println("<h2>Статистика голосов:</h2>");
            print.println("<ul>");

            for (Map.Entry<String, Integer> entry : statistics.getArtistsVotesMap().entrySet()) {
                print.println("<li>" + entry.getKey() + ": " + entry.getValue() + " голосов</li>");
            }
            print.println("</ul>");

            print.println("<h2>Статистика голосов по жанрам:</h2>");
            print.println("<ul>");
            for (Map.Entry<String, Integer> entry : statistics.getGenresVotesMap().entrySet()) {
                print.println("<li>" + entry.getKey() + ": " + entry.getValue() + " голосов</li>");
            }
            print.println("</ul>");

            print.println("<h2>Информация о пользователях:</h2>");
            print.println("<ul>");
            for (Map.Entry<String, LocalTime> entry : statistics.getUserInformationMap().entrySet()) {
                print.println("<li>Пользователь: " + entry.getKey() + ", Время: " + entry.getValue() + "</li>");
            }
            print.println("</ul>");

            print.println("</body></html>");
        }

    }
}
