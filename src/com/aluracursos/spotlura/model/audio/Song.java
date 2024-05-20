package com.aluracursos.spotlura.model.audio;

import com.aluracursos.spotlura.controller.Classifier;

public class Song extends Audio implements Classifier {
    private String genre;
    private boolean parentalAdvisory;

    public Song(String title, String artist, boolean parentalAdvisory) {
        super(title, artist);
        this.parentalAdvisory = parentalAdvisory;
    }

    public boolean isParentalAdvisory() {
        return parentalAdvisory;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getClassifier(){
        return parentalAdvisory;
    }

    public void writeSong(){
        super.writeAudio();
        System.out.println("cual es el genero?");
        setGenre(sc.next());
    }
    public void readSong(){
        super.readAudio();
        System.out.println("Genero: " + getGenre());
    }

}
