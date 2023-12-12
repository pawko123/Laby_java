package Lab_10;

import java.io.FileWriter;
import java.io.IOException;

public class Gra extends Thread{
    String nazwa;
    String gatunek;
    String producent;
    String wydawca;
    int rok_wydania;

    public Gra(String nazwa, String gatunek, String producent, String wydawca, int rok_wydania) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.producent = producent;
        this.wydawca = wydawca;
        this.rok_wydania = rok_wydania;
    }
    public String toString(){
        return "Nazwa: "+nazwa+" Gatunek: "+gatunek+" Producent: "+producent+" Wydawca: "+wydawca+" Rok wydania: "+rok_wydania;
    }
    public void run(){

    }
}
