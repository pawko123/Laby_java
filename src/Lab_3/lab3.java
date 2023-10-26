package Lab_3;
import java.util.Scanner;
import java.util.Random;
public class lab3 {
    public static void zad1(){
        System.out.println("Podaj liczbe calkowita");
        Scanner input=new Scanner(System.in);
        String liczba=input.next();
        int liczba_int=Integer.parseInt(liczba);
        int suma_p=0,suma_n=0,liczba_p=0,liczba_n=0;
        for(int i=0;i<liczba.length();i++) {
            if (liczba.charAt(i) % 2 == 0) {
                char znak=liczba.charAt(i);
                suma_p += Character.getNumericValue(znak);
                liczba_p++;
            } else {
                char znak=liczba.charAt(i);
                suma_n += Character.getNumericValue(znak);
                liczba_n++;
            }
        }
        if(liczba_p!=0&&liczba_n!=0) {
            double srednia_p = (double) suma_p / (double) liczba_p, srednia_n = (double) suma_n / (double) liczba_n;
            double stosunek = srednia_n / srednia_p;
            System.out.println("Stosunek srednich wynosi: "+stosunek);
        }
        else {
            System.out.println("Stosunek srednich wynosi 0");
        }
        boolean czypierwsza=true;
        for(int i=2;i<=Math.sqrt(liczba_int);i++){
            if(liczba_int%i==0){
                System.out.println("Podana liczba nie jest pierwsza");
                czypierwsza=false;
                break;
            }
        }
        if(czypierwsza==true){
            System.out.println("Podana liczba jest pierwsza");
        }
    }
    public static void zad2(){
        System.out.println("Podaj liczbe");
        Scanner input=new Scanner(System.in);
        int liczba = input.nextInt();
        System.out.println("Dzielniki liczby "+liczba+" to:");
        for(int i=1;i<=liczba;i++) {
            if (liczba % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void zad3(){
        Scanner input = new Scanner(System.in);
        Random losowa = new Random();
        int wylosowana=losowa.nextInt(200)+1;
        System.out.println("Zgadnij liczbe");
        boolean udane=true;
        int zgadywana=0;
        while (udane){
            zgadywana=input.nextInt();
            input.nextLine();
            if(zgadywana==wylosowana){
                System.out.println("Wybrales prawidlowa liczbe");
                udane=false;
            }
            else if(zgadywana<wylosowana){
                System.out.println("Wylosowana liczba jest wieksza");
            }
            else if(zgadywana>wylosowana){
                System.out.println("Wylosowana liczba jest mniejsza");
            }
        }
    }
    public static void zad4(){
        Scanner input = new Scanner(System.in);
        int iloczyn = 1,liczba=0;
        boolean czy5=true;
        System.out.println("Wprowadzaj liczby. Program zakończy działanie po podaniu liczby 5.");
        while (czy5){
            liczba=input.nextInt();
            input.nextLine();
            iloczyn*=liczba;
            if(liczba==5){
                czy5=false;
            }
        }
        System.out.println("Ïloczyn liczb wynosi: "+iloczyn);
    }
    public static void zad5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj nieujemną liczbę całkowitą: ");
        int liczba = input.nextInt();
        boolean czynieujemna=true;
        while (czynieujemna) {
            if (liczba < 0) {
                System.out.println("Podana liczba musi być nieujemna.");
            }
            else {
                czynieujemna=false;
            }
        }
        int potegowanaliczba = 1;

        System.out.println("Potęgi liczby 3 mniejsze niż " + liczba + ":");

        while (potegowanaliczba < liczba) {
            System.out.println(potegowanaliczba);
            potegowanaliczba *=3;
        }
    }
}