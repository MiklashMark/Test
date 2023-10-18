package by.it_academy.jd2.Mk_JD2_103_23.vote.service;

import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Genre;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IGenreDao;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.api.IGenreService;

import java.util.List;

public class GenreService implements IGenreService {

    private IGenreDao dao;

    public GenreService(IGenreDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Genre> get() {
        return this.dao.get();
    }
}
