package Lab_7;

import Lab_5.Autokomis;
import Lab_5.Samochod;

public class Run7 {
    public Run7(){
        //tworzenie komis
        Samochod Opelek=new Samochod();
        Autokomis komis=new Autokomis();
        komis.samochody.add(Opelek);
        komis.samochody.add(new Samochod("Toyota","Corolla",1.8,
                "sedan","benzyna",2022,1,1,2022,50000));
        komis.samochody.add(new Samochod("Ford","Focus",1.6,
                "hatchback","diesel",2021,15,6,2021,45000));
        //kalkulator
        new Kalkulator(5);
        new Kalkulator(5,7,1,3);
        new Kalkulator(5,7,2,7,2,8,4);
        //csv za pomoca csvreader
        Handle_csv test=new Handle_csv();
        test.odczyt("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik.csv");
        test.zapis("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\samochody.csv",komis.samochody);
        //proste read write
        Reader_Writer csv=new Reader_Writer();
        String text="1,Opel,Corsa,1.6,hatchback,benzyna,2022,16,8,2020,56000\n" +
                "2,Toyota,Corolla,1.8,sedan,benzyna,2022,1,1,2022,50000\n" +
                "3,Ford,Focus,1.6,hatchback,diesel,2021,15,6,2021,45000";
        csv.odczyt("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik.csv");
        csv.zapis("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik2.csv",text);
    }
}
