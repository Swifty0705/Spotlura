package com.aluracursos.spotlura.model.release;

import java.util.Date;

public class Release {
    private String title;
    private Date releaseDate;
    private String creator;
    private int rating;
    private String genre;
    private String description;

    public Release(String creator, String title) {
        this.creator = creator;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCreator() {
        return creator;
    }


    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

}
