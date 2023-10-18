package by.it_academy.jd2.Mk_JD2_103_23.vote.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.VoteDao;
import by.it_academy.jd2.Mk_JD2_103_23.vote.dao.api.IVoteDao;

public class VoteDaoFactory {
    private volatile static IVoteDao instance;

    private VoteDaoFactory() {
    }

    public static IVoteDao getInstance() {
        if (instance == null) {
            synchronized (VoteDao.class) {
                if (instance == null) {
                    instance = new VoteDao();
                }
            }
        }
        return instance;
    }
}
