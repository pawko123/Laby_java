package Lab_10;

import java.io.FileWriter;
import java.io.IOException;

public class Run10{
    public Run10(){
        for(int i=1;i<=15;i++) {
            Watek watek = new Watek();
            watek.start();
        }
        Katalog katalog=new Katalog();
        try (FileWriter writer = new FileWriter("C:\\Users\\Paweł\\IdeaProjects\\Laby_java\\src\\Lab_10\\zapis.log")) {
            for(Gra gra: katalog.katalog_gier){
                writer.write(this.toString()+"\n");
            }
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }

    }
}
