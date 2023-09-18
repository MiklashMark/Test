package by.it_academy.jd2.Mk_JD2_103_23.vote.core.dto;

import java.util.ArrayList;
import java.util.List;

public class Vote {
    private Artist artist;
    private List<Genre> genres = new ArrayList<>();
    private String aboutMe;

    public Vote() {
    }

    public Vote(Artist artist, List<Genre> genres, String aboutMe) {
        this.artist = artist;
        this.genres = genres;
        this.aboutMe = aboutMe;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void addGenres(Genre genres) {
        this.genres.add(genres);
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "artist=" + artist +
                ", genres=" + genres +
                ", aboutMe='" + aboutMe + '\'' +
                '}';
    }
}
