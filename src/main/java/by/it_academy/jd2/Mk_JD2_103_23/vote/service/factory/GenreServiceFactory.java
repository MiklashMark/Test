package by.it_academy.jd2.Mk_JD2_103_23.vote.service.factory;

import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.factory.GenreDaoFactory;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.GenreService;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.api.IGenreService;

public class GenreServiceFactory {
    private volatile static GenreService instance;

    private GenreServiceFactory() {
    }

    public static IGenreService getInstance() {
        if(instance == null){
            synchronized (GenreServiceFactory.class){
                if(instance == null){
                    instance = new GenreService(GenreDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
