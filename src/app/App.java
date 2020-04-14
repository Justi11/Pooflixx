package app;

public class App {
    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

    
        Serie bb = miPooflix.buscarSerie(" Walking Dead ");

        Temporada laMejorTemporada = bb.getTemporada(5);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

        Episodio otroEpi;

        otroEpi = laMejorTemporada.getEpisodio(16);

        otroEpi.reproducir();
    }
}