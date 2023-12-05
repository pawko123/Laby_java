package Lab_7;
import Lab_5.Samochod;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
public class Handle_csv {
    public void odczyt(String plik){
        try (CSVReader csvReader = new CSVReader(new FileReader(plik))) {
            List<String[]> rekordy = csvReader.readAll();

            for (String[] rekord : rekordy) {
                // Dla każdego rekordu możesz wykonywać operacje
                for (String pole : rekord) {
                    System.out.print(pole + "\t");
                }
                System.out.println(); // Nowa linia po każdym rekordzie
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
    public void zapis(String sciezka, ArrayList<Samochod> tabela){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sciezka))) {
            for (Samochod auto : tabela) {
                writer.write(auto.getMarka()+',');
                writer.write(auto.getmodel()+',');
                writer.write(String.valueOf(auto.getpojemnoscsilnika())+',');
                writer.write(auto.gettypnadwozia()+',');
                writer.write(auto.gettypsilnika()+',');
                writer.write(String.valueOf(auto.getrokprodukcji())+',');
                writer.write(String.valueOf(auto.getdata1rejestracji().getdzien())+',');
                writer.write(String.valueOf(auto.getdata1rejestracji().getmiesiac())+',');
                writer.write(String.valueOf(auto.getdata1rejestracji().getrok())+',');
                writer.write(String.valueOf(auto.getcena()));
                writer.newLine();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
