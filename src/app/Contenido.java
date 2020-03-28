package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {

    public String titulo;
    public Director director;
    public double tiempoVisto;

    public List<String>premios= new ArrayList<>();
    public List<Genero>generos =new ArrayList<>();
    public List<Actor>actores =new ArrayList<>();

    public boolean visto(){
        return true;
    }
    
    public void reproducir(){
        System.out.println("reproduciendo");

    }
    public void pausar(){
        System.out.println("pausado");

    }






}