package Lab_6;

import java.util.Random;
import java.util.Scanner;

public class Pralka {
    Grzalka grzalka;
    Beben beben;
    Filtr filtr;
    Pojemnik_na_detergenty pojemnik;
    Programy_pralki lista;
    int waga;
    public Pralka(){
        this.lista=new Programy_pralki();
        grzalka=new Grzalka();
        beben=new Beben();
        filtr=new Filtr();
        pojemnik=new Pojemnik_na_detergenty();
        waga=0;
        petla_dzialania(this);
    }
    public void podaj_liste_programow(Pralka pralka){
        this.lista.wypisz_programy();
    }
    public void czekaj(int naile){
        try {
            Thread.sleep(naile * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void dzialanie_programu(){
        System.out.println("1.Wybierz program");
        this.lista.wypisz_programy();
        Scanner scanner=new Scanner(System.in);
        int program= scanner.nextInt();
        Program wybrany=this.lista.lista_programow.get(program-1);
        System.out.println("Grzanie wody...");
        czekaj(5);
        System.out.println("Pompowanie wody...");
        czekaj(2);
        this.grzalka.temperatura=wybrany.temperatura;
        this.beben.predkosc= wybrany.predkosc_prania;
        Random random=new Random();
        int losowa=random.nextInt(10);
        if(losowa>7){
            this.filtr.czybrudny=true;
        }
        this.pojemnik.proszek=false;
        this.pojemnik.plyn=false;
        System.out.println("Trwa pranie wstepne...");
        czekaj(wybrany.czas_prania_wstp);
        System.out.println("Trwa pranie zasadnicze...");
        czekaj(wybrany.czas_prania_zasadniczego);
        System.out.println("Pranie sie zakonczylo");
        if(wybrany.dodatkowe_plukanie){
            System.out.println("Trwa dodatkowe plukanie...");
            czekaj(5);
        }
    }
    public void petla_dzialania(Pralka uzywana_pralka){
        boolean czydziala=true;
        int numer;
        while (czydziala){
            Scanner wybieranie_numeru=new Scanner(System.in);
            System.out.println("1.Wlacz program");
            System.out.println("2.Stworz nowy program");
            System.out.println("3.Wypisz programy");
            System.out.println("4.Dodaj plyn do plukania");
            System.out.println("5.Dodaj proszek do prania");
            System.out.println("6.Dodaj ubrania");
            System.out.println("7.Wymien filtr");
            System.out.println("8.Wylacz pralke");
            numer=wybieranie_numeru.nextInt();
            if(numer==1){
                if(!this.pojemnik.plyn || !this.pojemnik.proszek){
                    System.out.println("Nalezy dodac plyn i proszek przed rozpoczeciem prania");
                }
                else if(this.filtr.czybrudny){
                    System.out.println("Filtr jest brudny i nalezy go wymienic");
                }
                else {
                    dzialanie_programu();
                }
            }
            if (numer==2){
                lista.lista_programow.add(new Program());
            }
            if(numer==3){
                lista.wypisz_programy();
            }
            if(numer==4){
                this.pojemnik.plyn=true;
            }
            if(numer==5){
                this.pojemnik.proszek=true;
            }
            if(numer==6){
                System.out.println("Ile prania dodajesz(max 6kg)");
                Scanner scanner=new Scanner(System.in);
                boolean czydobra=false;
                while (!czydobra){
                    int liczba= scanner.nextInt();
                    if(liczba>6){
                        System.out.println("Za duza ilosc prania.Podaj wartosc ponownie");
                    }
                    else {
                        czydobra=true;
                        this.waga=liczba;
                    }
                }
            }
            if(numer==7){
                this.filtr.czybrudny=false;
            }
            if(numer==8){
                czydziala=false;
            }
        }
    }
}
