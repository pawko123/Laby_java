package Lab_7;

import java.util.Arrays;

public class Kalkulator {
    public int[] liczby;
    //silnia
    public Kalkulator(int liczba1) {
        this.liczby = new int[]{liczba1};
        int wynik=1;
        for(int i=2;i<=liczba1;i++){
            wynik*=i;
        }
        System.out.println("Wynik silni to: "+wynik);
    }
    //mnozenie
    public Kalkulator(int liczba1,int liczba2,int liczba3,int liczba4) {
        this.liczby = new int[]{liczba1,liczba2,liczba3,liczba4};
        int wynik=1;
        for (int i : liczby) {
            wynik *= i;
        }
        System.out.println("Wynik mnozenia to: "+wynik);
    }
    //dodawanie
    public Kalkulator(int liczba1,int liczba2,int liczba3,int liczba4,int liczba5,int liczba6,int liczba7) {
        this.liczby = new int[]{liczba1,liczba2,liczba3,liczba4,liczba5,liczba6,liczba7};
        int wynik=0;
        for (int i : liczby) {
            wynik += i;
        }
        System.out.println("Wynik dodawania to: "+wynik);
    }
    public Kalkulator(Kalkulator oryginal){
        this.liczby= Arrays.copyOf(oryginal.liczby,oryginal.liczby.length);
    }

}
