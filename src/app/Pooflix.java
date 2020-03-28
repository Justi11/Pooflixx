package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Pooflix
 */
public class Pooflix {
     String buscarPorTitulo;
     String titulo;
     String buscarPelicula;
     String buscarSerie;
     String actor;
          

     

    public List<Pelicula>peliculas = new ArrayList<>();
    public List<Serie>series = new ArrayList<>();
   
    public Serie buscarSerie(String titulo){
        
        for (Serie s : this.series) {
            if (s.titulo.equals(titulo))
            return s;
        }
        return null;
    }
    


    public Pelicula buscarPelicula(String Pelicula){
        return null;
    }
    public Serie buscarSerie(Actor actor){
        return null;

    }

    public void inicializarCatalogo() {
        
        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero generos = new Genero();
        generos.nombre = "Drama";
        breakingB.generos.add(generos);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodio.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodio.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);



    }
    
    
}