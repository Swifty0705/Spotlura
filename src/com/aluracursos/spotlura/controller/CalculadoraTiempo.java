package com.aluracursos.spotlura.controller;

import com.aluracursos.spotlura.model.audio.Audio;

public class CalculadoraTiempo {
    private int totalTime = 0;

    public  int getTotalTime() {
        return this.totalTime;
    }

    public void AddTime(Audio audio){
        this.totalTime += audio.getDurationInSeconds();
    }

}
