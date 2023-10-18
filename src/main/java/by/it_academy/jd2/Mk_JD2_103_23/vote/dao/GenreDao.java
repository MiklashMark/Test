package by.it_academy.jd2.Mk_JD2_103_23.vote.dao;

import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Genre;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IGenreDao;

import java.util.ArrayList;
import java.util.List;

public class GenreDao implements IGenreDao {

    private List<Genre> data = new ArrayList<>();

    public GenreDao() {
        this.data.add(new Genre(1L, "Hip-Hop"));
        this.data.add(new Genre(2L, "Диско"));
        this.data.add(new Genre(3L, "Реп"));
        this.data.add(new Genre(4L, "Эстрада"));
        this.data.add(new Genre(5L, "Рэгги"));
    }

    @Override
    public List<Genre> get() {
        return this.data;
    }
}
