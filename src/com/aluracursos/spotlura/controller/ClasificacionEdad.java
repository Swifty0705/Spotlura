package com.aluracursos.spotlura.controller;

public class ClasificacionEdad {

    public void Filter(Classifier classifier) {
        if(classifier.getClassifier()){
            System.out.println("Este producto es para gente mayor");
        }else {
            System.out.println("Este producto es para todo el publico");
        }
    }
}
