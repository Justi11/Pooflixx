package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido {
    public List<Temporada> temporadas = new ArrayList<>();
    

    public Temporada getTemporada(int numeroDeTemporada) {
        for (Temporada tempo : this.temporadas) {
            if (tempo.numero == numeroDeTemporada) {
                return tempo;
            }
        }

        return null;

    }

}