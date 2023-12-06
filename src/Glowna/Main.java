package Glowna;
import Lab_8.*;
public class Main{
    public static void main(String[] args) {
        //lab2 lista_druga=new lab2();
        //lab3 lista_trzecia=new lab3();
        //lab4 lista_czwarta=new lab4();

        /*Samochod Opelek=new Samochod();
        Autokomis komis=new Autokomis();
        komis.samochody.add(Opelek);
        komis.samochody.add(new Samochod("Toyota","Corolla",1.8,
                "sedan","benzyna",2022,1,1,2022,50000));
        komis.samochody.add(new Samochod("Ford","Focus",1.6,
                "hatchback","diesel",2021,15,6,2021,45000));*/
        /*Rectangle myRect=new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("Obszar kwadratu: " + myRect.area());*/
        //Pralka pralka=new Pralka();
        /*new Kalkulator(5);
        new Kalkulator(5,7,1,3);
        new Kalkulator(5,7,2,7,2,8,4);*/
        /*Handle_csv test=new Handle_csv();
        test.odczyt("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik.csv");
        test.zapis("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\samochody.csv",komis.samochody);
        Reader_Writer csv=new Reader_Writer();
        String text="1,Opel,Corsa,1.6,hatchback,benzyna,2022,16,8,2020,56000\n" +
                "2,Toyota,Corolla,1.8,sedan,benzyna,2022,1,1,2022,50000\n" +
                "3,Ford,Focus,1.6,hatchback,diesel,2021,15,6,2021,45000";
        csv.odczyt("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik.csv");
        csv.zapis("C:\\Users\\games\\Desktop\\Studia\\Java\\Laby\\src\\Lab_7\\plik2.csv",text);*/
        /*Student s1=new Student("Pawel","Laskarzewski");
        Student s2=new Student("Pawko","Laskarzewski");
        Student s3=new Student("Pawcio","Laskarzewski");
        Lista_studentow grupa=new Lista_studentow();
        grupa.lista.add(s1);
        grupa.lista.add(s2);
        grupa.lista.add(s3);
        System.out.println(grupa.ilu_studentow());
        grupa.studentnr3();*/
        Regex test=new Regex();
        test.slowa_zdania();
        test.adres_email("test@gmail.com");
        test.adres_email("nieadresemail");
    }
}
