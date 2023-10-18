package by.it_academy.jd2.Mk_JD2_103_23.vote.service.factory;

import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.factory.ArtistDaoFactory;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.ArtistService;
import by.it_academy.jd2.Mk_JD2_103_23.vote.service.api.IArtistService;

public class ArtistServiceFactory {
    private volatile static ArtistService instance;

    private ArtistServiceFactory() {
    }

    public static IArtistService getInstance() {
        if(instance == null){
            synchronized (ArtistServiceFactory.class){
                if(instance == null){
                    instance = new ArtistService(ArtistDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
