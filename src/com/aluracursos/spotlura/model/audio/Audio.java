package com.aluracursos.spotlura.model.audio;

import java.util.Date;
import java.util.Scanner;

public class Audio {
    private String title;
    private String artist;
    private int durationInSeconds;
    private Date releaseDate;
    private int rating;
    private boolean likeIt = false;
    private boolean favorite = false;
    private boolean playing = false;
    Scanner sc = new Scanner(System.in);

    public Audio(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isLikeIt() {
        return likeIt;
    }

    public void setLikeIt(boolean likeIt) {
        this.likeIt = likeIt;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void writeAudio(){
        System.out.println("Que dia fue lanzado?");
        int day = sc.nextInt();
        System.out.println("Que mes fue lanzado?");
        int month = sc.nextInt();
        System.out.println("que año fue lanzado?");
        int year = sc.nextInt();
        setReleaseDate(new Date(year,month,day));
        System.out.println("La estas escuchando ahora");
        setPlaying(sc.nextBoolean());
        System.out.println("Te gusta?");
        setLikeIt(sc.nextBoolean());
        System.out.println("Es tu favorita?");
        setFavorite(sc.nextBoolean());
        System.out.println("Digite el tiempo en segundos");
        setDurationInSeconds(sc.nextInt());
        System.out.println("Que nota le das? del 1 al 10");
        setRating(sc.nextInt());
    }

    public void readAudio(){
        System.out.println("Nombre: "+ getTitle());
        System.out.println("Artista: "+ getArtist());
        System.out.println("Fecha: " + getReleaseDate());
        System.out.println("Escuchando: "+ isPlaying());
        System.out.println("Te gusta: "+ isLikeIt());
        System.out.println("es tu favorita: "+ isFavorite());
        System.out.println("Nota: " + getRating());
        System.out.println("Tiempo: " + (double) (getDurationInSeconds() /60) + "min");
    }

}
