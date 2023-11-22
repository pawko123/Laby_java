package Lab_6;

import java.util.Scanner;

public class Pralka {
    Grzalka grzalka;
    Beben beben;
    Filtr filtr;
    Pojemnik_na_detergenty pojemnik;
    Programy_pralki lista;
    public Pralka(){
        this.lista=new Programy_pralki();
        petla_dzialania(this);
    }
    public void podaj_liste_programow(Pralka pralka){
        this.lista.wypisz_programy();
    }
    public void petla_dzialania(Pralka uzywana_pralka){
        boolean czydziala=true;
        int numer;
        while (czydziala){
            Scanner wybieranie_numaru=new Scanner(System.in);
            System.out.println("1.Wlacz program");
            System.out.println("2.Stworz nowy program");
            System.out.println("3.Wypisz programy");
            System.out.println("4.Wylacz pralke");
            numer=wybieranie_numaru.nextInt();
            if (numer==2){
                lista.lista_programow.add(new Program());
            }
            if(numer==3){
                lista.wypisz_programy();
            }
            if(numer==4){
                czydziala=false;
            }
        }
    }
}
