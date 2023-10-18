package by.it_academy.jd2.Mk_JD2_103_23.vote.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.ArtistDao;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IArtistDao;

public class ArtistDaoFactory {
    private volatile static ArtistDao instance;

    private ArtistDaoFactory() {
    }

    public static IArtistDao getInstance() {
        if(instance == null){
            synchronized (ArtistDaoFactory.class){
                if(instance == null){
                    instance = new ArtistDao();
                }
            }
        }
        return instance;
    }
}
