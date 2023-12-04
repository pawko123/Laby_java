package Lab_6;

import java.util.Scanner;

public class Program {
    String nazwa;
    int temperatura;
    int czas_prania_wstp;
    int czas_prania_zasadniczego;
    boolean dodatkowe_plukanie;
    int predkosc_prania;
    Program(String nazwa,int temp,int wstp,int zas,boolean czydod,int speed){
        this.nazwa=nazwa;
        this.temperatura=temp;
        this.czas_prania_wstp=wstp;
        this.czas_prania_zasadniczego=zas;
        this.dodatkowe_plukanie=czydod;
        this.predkosc_prania=speed;
    }
    Program(){
        System.out.println("Podaj nazwe programu");
        Scanner input = new Scanner(System.in);
        this.nazwa= input.nextLine();
        int temp=100;
        while (temp>90){
            System.out.println("Podaj temperature prania(max 90 C)");
            temp=input.nextInt();
            if(temp>90){
                System.out.println("Podana wartosc przekracza wartosc max.Podaj ja ponownie");
            }
        }
        this.temperatura=temp;
        int czas1=30;
        while (czas1>20){
            System.out.println("Podaj czas prania wstepnego(max 20 min)");
            czas1=input.nextInt();
            if(czas1>20){
                System.out.println("Podana wartosc przekracza wartosc max.Podaj ja ponownie");
            }
        }
        this.czas_prania_wstp=czas1;
        czas1=110;
        while (czas1>100){
            System.out.println("Podaj czas prania wstepnego(max 100 min)");
            czas1=input.nextInt();
            if(czas1>100){
                System.out.println("Podana wartosc przekracza wartosc max.Podaj ja ponownie");
            }
        }
        this.czas_prania_zasadniczego=czas1;
        boolean czypoprawnie=false;
        while (!czypoprawnie) {
            System.out.println("Czy pralka ma zrobic dodatkowe plukanie?(odpowiedz true/false");
            if(input.hasNextBoolean()) {
                this.dodatkowe_plukanie = input.nextBoolean();
                czypoprawnie=true;
            }
            else {
                System.out.println("Podana zla wartosc.Podaj ja ponownie");
            }
        }
        int predkosc=1100;
        while(predkosc>1000){
            System.out.println("Podaj predkosc bebna(max 1000 obr/min)");
            predkosc=input.nextInt();
            if(predkosc>1000){
                System.out.println("Podana wartosc przekracza wartosc max.Podaj ja ponownie");
            }
        }
        this.predkosc_prania=predkosc;
        System.out.println("Zakonczono tworzenie programu. Podsumowanie:");
        this.wypisz_program();
    }
    public void wypisz_program(){
        System.out.println("Nazwa: "+this.nazwa);
        System.out.println("Temperatura: "+this.temperatura+" C");
        System.out.println("Czas prania wstepnego: "+this.czas_prania_wstp+" min");
        System.out.println("Czas prania zasadniczego: "+this.czas_prania_zasadniczego+" min");
        System.out.println("Dodatkowe plukanie: "+this.dodatkowe_plukanie);
        System.out.println("Predkosc bebna: "+this.predkosc_prania+" obr/min");
    }
}
