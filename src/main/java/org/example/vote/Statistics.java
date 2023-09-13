package org.example.vote;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Statistics implements IStatistics {
    private HashMap<String, Integer> genresVotesMap = new HashMap<>();
    private HashMap<String, Integer> artistsVotesMap = new HashMap<>();
    private HashMap<String, LocalTime> userInformationMap = new LinkedHashMap<>();
    private int votesNumber;

    @Override
    public void addUsersArtistVote(String artistVote) throws FileNotFoundException {
        votesNumber = artistsVotesMap.getOrDefault(artistVote, 0) + 1;
        artistsVotesMap.put(artistVote, votesNumber);
        artistsVotesMap = sortMap(artistsVotesMap);
    }

    @Override
    public void addUsersGenresVote(String[] genresVote) throws FileNotFoundException {
        for (String s : genresVote) {
            votesNumber = genresVotesMap.getOrDefault(s, 0) + 1;
            genresVotesMap.put(s, votesNumber);
        }
        genresVotesMap = sortMap(genresVotesMap);
    }

    @Override
    public void addUsersInformation(String usersInformation) {
        LocalTime localTime = LocalTime.now();
        userInformationMap.put(usersInformation, localTime);
    }

    @Override
    public  HashMap<String, Integer> sortMap(HashMap<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public HashMap<String, Integer> getGenresVotesMap() {
        return genresVotesMap;
    }

    public HashMap<String, Integer> getArtistsVotesMap() {
        return artistsVotesMap;
    }

    public HashMap<String, LocalTime> getUserInformationMap() {
        return userInformationMap;
    }
}

