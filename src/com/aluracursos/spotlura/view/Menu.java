package com.aluracursos.spotlura.view;

import com.aluracursos.spotlura.controller.CalculadoraTiempo;
import com.aluracursos.spotlura.model.audio.Podcast;
import com.aluracursos.spotlura.model.audio.Song;
import com.aluracursos.spotlura.controller.ClasificacionEdad;

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        System.out.println("Bienvenido a Spotlura");
        System.out.println("Por favor, selecciona una de las siguientes opciones:");
        int response = 0;
        String options = """
                1) Nueva canción 
                2) Nuevo podcast
                3) Ver tiempo total
                4) Exit
                """;
        do{
            System.out.println(options);
            Scanner sc = new Scanner(System.in);
            CalculadoraTiempo totalTime = new CalculadoraTiempo();
            ClasificacionEdad clasification = new ClasificacionEdad();
            response = sc.nextInt();
            String name;
            String artist;
            Boolean parentalAdvisor;
            Boolean mature;
            switch(response){
                case 1:
                    System.out.println("Nombre de la canción");
                    name = sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Nombre del Artista:");
                    artist = sc.nextLine();
                    System.out.println("Tiene Parental advisor");
                    parentalAdvisor = sc.nextBoolean();
                    Song song = new Song(name, artist, parentalAdvisor);
                    song.writeSong();
                    System.out.println("\n");
                    song.readSong();
                    clasification.Filter(song);
                    totalTime.AddTime(song);
                    break;
                case 2:
                    System.out.println("Nombre del podcast");
                    name = sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Artista");
                    artist = sc.nextLine();
                    System.out.println("Es para gente mayor de edad");
                    mature = sc.nextBoolean();
                    Podcast podcast = new Podcast(name, artist, mature);
                    podcast.writePodcast();
                    System.out.println("\n \n");
                    podcast.readPodcast();
                    clasification.Filter(podcast);
                    totalTime.AddTime(podcast);
                    break;
                case 3:
                    System.out.println(totalTime.getTotalTime());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }while(response != 4);
    }

}
