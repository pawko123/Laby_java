package Lab_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader_Writer {
    public void odczyt(String plik){
        try(FileReader reader=new FileReader(plik)){
            String zawartoscpliku = "";
            int znak;
            while ((znak=reader.read())!=-1){
                zawartoscpliku+=(char)znak;
            }
            System.out.println("Zawartosc pliku:");
            System.out.println(zawartoscpliku);
        } catch (IOException e){
            System.out.println("Blad odczytu pliku");
        }
    }
    public void zapis(String sciezka, String text){
        //zeby dopisywac do pliku  FileWriter write = new FileWriter(sciezka,true)
        try (FileWriter writer = new FileWriter(sciezka)) {
            writer.write(text);
            System.out.println("Zapisano do pliku.");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }
}
