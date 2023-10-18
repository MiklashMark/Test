package by.it_academy.jd2.Mk_JD2_103_23.vote.service;

import by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto.Artist;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IArtistDao;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.api.IArtistService;

import java.util.List;

public class ArtistService implements IArtistService {

    private IArtistDao dao;

    public ArtistService(IArtistDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Artist> get() {
        return this.dao.get();
    }
}
