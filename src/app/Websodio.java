package app;

public class Websodio extends Episodio {

    public String link;
    //redefinicion//
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio " + nombre  +   link );

    }


}