package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public int numero;

    public List<Episodio>episodio = new ArrayList<>();

    public Episodio getEpisodio(int numero) {

        for (Episodio epi : this.episodio) {
            if (epi.numero == numero) {
        
                return epi;
            }
        }
            return null;
    }
}