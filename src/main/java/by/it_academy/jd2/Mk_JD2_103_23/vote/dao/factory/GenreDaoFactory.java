package by.it_academy.jd2.Mk_JD2_103_23.vote.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.GenreDao;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IGenreDao;

public class GenreDaoFactory {
    private volatile static GenreDao instance;

    private GenreDaoFactory() {
    }

    public static IGenreDao getInstance() {
        if(instance == null){
            synchronized (GenreDaoFactory.class){
                if(instance == null){
                    instance = new GenreDao();
                }
            }
        }
        return instance;
    }
}
