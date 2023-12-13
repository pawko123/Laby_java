package Lab_10;

import java.io.FileWriter;
import java.io.IOException;

public class Gra extends Thread implements Runnable{
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
        try (FileWriter writer = new FileWriter("C:\\Users\\games\\IdeaProjects\\Laby_java\\src\\Lab_10\\zapis.log",true)) {
            writer.write(this.toString()+"\n");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }
}
