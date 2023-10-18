package by.it_academy.jd2.Mk_JD2_103_23.vote.dao;

import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Artist;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IArtistDao;

import java.util.ArrayList;
import java.util.List;

public class ArtistDao implements IArtistDao {

    private List<Artist> data = new ArrayList<>();

    public ArtistDao() {
        this.data.add(new Artist(1L, "Леонтьев"));
        this.data.add(new Artist(2L, "Пугачёва"));
        this.data.add(new Artist(3L, "Моцарт"));
        this.data.add(new Artist(4L, "50cent"));
        this.data.add(new Artist(5L, "Морген"));
        this.data.add(new Artist(6L, "Хлеб"));
    }

    @Override
    public List<Artist> get() {
        return this.data;
    }
}
