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

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.titulo.equals(titulo))
                return s;
        }
        return null;
    }

    public Pelicula buscarPelicula(String Pelicula) {
        return null;
    }

    public Serie buscarSerie(Actor actor) {
        return null;

    }

    public void inicializarCatalogo() {
        
        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

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
    

        
        Serie walkingDead = new Serie();
        walkingDead.titulo = " Walking Dead ";

        Genero generoh = new Genero();
        generoh.nombre = " Horror ";
        walkingDead.generos.add(generoh);

        Temporada temp5 = new Temporada();
        temp5.numero = 5;
    
        Episodio ep1 = new Episodio();
        ep1.numero = 1;
        ep1.nombre = " No Sanctuary ";
        ep1.duracion = 40;

        temp5.episodio.add(ep1);

        Episodio ep2= new Episodio();
        ep2.numero = 16;
        ep2.nombre = " Conquer ";
        ep2.duracion = 40;

        temp5.episodio.add(ep2);

        Websodio wb = new Websodio();
        wb.numero = 2;
        wb.nombre = "A new day";
        wb.duracion = 2;
        wb.link = "http.//wb.com";

        temp5.episodio.add(wb);

        Websodio wb2 = new Websodio();
        wb2.numero = 3;
        wb2.nombre = "Family matters";
        wb2.duracion = 20;
        wb2.link = "http.//wb.com";

        temp5.episodio.add(wb2);

        walkingDead.temporadas.add(temp5);

        
        Temporada t1 = new Temporada();
        t1.numero = 5;

        Episodio epi = new Episodio();
        epi.numero = 6;
        epi.nombre = " TS-19 ";
        epi.duracion = 40;

        t1.episodio.add(epi);
        
        Episodio epi2 = new Episodio();
        epi2.numero = 5;
        epi2.nombre = " Wildfire ";
        epi2.duracion = 40;

        t1.episodio.add(epi2);

        walkingDead.temporadas.add(t1);

        this.series.add(walkingDead);
        }
    }

