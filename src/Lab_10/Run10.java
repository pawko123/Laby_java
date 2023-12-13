package Lab_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Run10{
    public Run10() throws InterruptedException {
        for(int i=1;i<=15;i++) {
            Watek watek = new Watek();
            watek.start();
            watek.join();
        }
        Katalog katalog=new Katalog();
        for(Gra gra: katalog.katalog_gier){
            //dla Thread
            //gra.start();
            //gra.join();
            //dla Runnable
            //Thread thread = new Thread(gra);
            //thread.start();
            //thread.join();
        }
            //odczyt
            ArrayList<String> zawartoscpliku=new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\games\\IdeaProjects\\Laby_java\\src\\Lab_10\\komendy.txt"))) {
                String linia="";
                while ((linia=reader.readLine())!=null){
                    zawartoscpliku.add(linia);
                }
            } catch (IOException e) {
                System.err.println("Błąd odczytu pliku");
            }
            for(int i=0;i<10;i++){
                Thread threadx=new Thread(new Odczyt(i*10,((i+1)*10)-1,zawartoscpliku));
                threadx.start();
                threadx.join();
            }
    }
}
