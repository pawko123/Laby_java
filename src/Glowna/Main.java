package Glowna;
//import Lab_2.*;
//import Lab_3.*;
//import Lab_4.*;
import Lab_5.*;
import Lab_6.*;
import Lab_7.*;
public class Main{
    public static void main(String[] args) {
        //lab2 lista_druga=new lab2();
        //lab3 lista_trzecia=new lab3();
        //lab4 lista_czwarta=new lab4();

        Samochod Opelek=new Samochod();
        Autokomis komis=new Autokomis();
        komis.samochody.add(Opelek);
        komis.samochody.add(new Samochod("Toyota","Corolla",1.8,
                "sedan","benzyna",2022,1,1,2022,50000));
        komis.samochody.add(new Samochod("Ford","Focus",1.6,
                "hatchback","diesel",2021,15,6,2021,45000));
        /*Rectangle myRect=new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("Obszar kwadratu: " + myRect.area());*/
        //Pralka pralka=new Pralka();
        Handle_csv test=new Handle_csv();
        test.odczyt("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik.csv");
        test.zapis("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\samochody.csv",komis.samochody);
    }
}
