package by.it_academy.jd2.Mk_JD2_103_23.vote.endpoint.html;

import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Artist;
import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Genre;
import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Vote;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class voteServlet extends HttpServlet {

    private static final String ARTIST_PARAM_NAME = "artist";
    private static final String GENRE_PARAM_NAME = "genre";
    private static final String ABOUTME_PARAM_NAME ="aboutMe";


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        String artist = req.getParameter(ARTIST_PARAM_NAME);
        String[] genres = req.getParameterValues(GENRE_PARAM_NAME);
        String aboutMe = req.getParameter(ABOUTME_PARAM_NAME);

        Vote vote = new Vote();

        vote.setArtist(new Artist(artist));
        vote.setAboutMe(aboutMe);

        for (String g : genres) {
            vote.addGenres(new Genre(g));
        }



    }
}
