package Lab_8;

import Lab_5.*;
import java.util.Collections;
import java.util.Comparator;

public class Run8 {
    public static void main(String[] args){
        Samochod Opelek=new Samochod();
        Autokomis komis=new Autokomis();
        komis.samochody.add(Opelek);
        komis.samochody.add(new Samochod("Toyota","Corolla",1.8,
                "sedan","benzyna",2022,1,1,2022,50000));
        komis.samochody.add(new Samochod("Ford","Focus",1.6,
                "hatchback","diesel",2021,15,6,2021,45000));
        Student s1=new Student("Pawel","Laskarzewski");
        Student s2=new Student("Pawko","Laskarzewski");
        Student s3=new Student("Pawcio","Laskarzewski");
        Lista_studentow grupa=new Lista_studentow();
        grupa.lista.add(s1);
        grupa.lista.add(s2);
        grupa.lista.add(s3);
        System.out.println(grupa.ilu_studentow());
        grupa.studentnr3();
        Regex test=new Regex();
        test.slowa_zdania();
        test.adres_email("test@gmail.com");
        test.adres_email("nieadresemail");
        Interrejs_lambdy normalne_wypisanie=(autokomis)->{
            for(Samochod auto:autokomis.samochody){
                System.out.println(auto.toString());
            }
        };
        Interrejs_lambdy posortowane_i_wypisanie=(autokomis)->{
            Collections.sort(autokomis.samochody, Comparator.comparingDouble(Samochod::getpojemnoscsilnika));
            normalne_wypisanie.wypisz(autokomis);
        };
        normalne_wypisanie.wypisz(komis);
        posortowane_i_wypisanie.wypisz(komis);
    }
}
