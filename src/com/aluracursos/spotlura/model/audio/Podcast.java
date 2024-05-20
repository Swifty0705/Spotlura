package com.aluracursos.spotlura.model.audio;

import com.aluracursos.spotlura.controller.Classifier;

public class Podcast extends Audio implements Classifier {
    private String topic;
    private boolean mature;

    public Podcast(String title, String artist, boolean mature) {
        super(title, artist);
        this.mature = mature;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean isMature() {
        return mature;
    }

    public boolean getClassifier(){
        return mature;
    }

    public void writePodcast(){
        super.writeAudio();
        System.out.println("de que trata el podcast");
        setTopic(sc.next());
    }
    public void readPodcast(){
        super.readAudio();
        System.out.println("De que trata: "+ getTopic());
    }
}
