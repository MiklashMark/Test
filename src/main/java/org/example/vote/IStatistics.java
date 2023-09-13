package org.example.vote;

import java.io.FileNotFoundException;
import java.util.HashMap;

public interface IStatistics {
    public void addUsersArtistVote(String artistVote) throws FileNotFoundException;
    public void addUsersGenresVote(String[] genresVote) throws FileNotFoundException;
    public void addUsersInformation(String usersInformation);
    public  HashMap<String, Integer> sortMap(HashMap<String, Integer> map);
}
