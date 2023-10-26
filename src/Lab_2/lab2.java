package Lab_2;
import java.util.Arrays;
import java.util.Scanner;
public class lab2 {
    public static void zad1() {
        System.out.println("Podaj wysokosc piramidy");
        Scanner input=new Scanner(System.in);
        int rows = input.nextInt(), k = 0;
        input.nextLine();
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
    public static void zad2(){
        System.out.println("Podaj a");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        input.nextLine();
        System.out.println("Podaj b");
        int b=input.nextInt();
        System.out.println("Podaj c");
        input.nextLine();
        int c=input.nextInt();
        int delta=(int)Math.pow(b, 2)-4*a*c;
        if(delta>0) {
            double pierwiastek=Math.sqrt((double)delta);
            double wynik1=(-(double)b-pierwiastek)/(2.0*(double)a);
            double wynik2=(-(double)b+pierwiastek)/(2.0*(double)a);
            System.out.println("Wynik rownania:x1="+wynik1+" x2="+wynik2);
        }
        if(delta==0) {
            double wynik=(-(double)b)/(2.0*(double)a);
            System.out.println("Wynik rownania:x="+wynik);
        }
        if(delta<0) {
            System.out.println("Brak rozwiazan rownania");
        }
    }
    public static void zad3(){
        System.out.println("Podaj szybkosc w milach/h");
        Scanner input=new Scanner(System.in);
        double mile=input.nextDouble();
        double kilometry=mile*1.61;
        System.out.printf("Szybkosc wynosi %.2f km/h\n",kilometry);
    }
    public static void zad4(){
        System.out.println("Podaj ilosc liczb");
        Scanner input=new Scanner(System.in);
        int[] tabela=new int[input.nextInt()];
        for(int i=0;i<tabela.length;i++){
            System.out.println("Podaj "+(i+1)+" liczbe");
            tabela[i]=input.nextInt();
            input.nextLine();
        }
        System.out.println("Maksymalna liczba to: "+ Arrays.stream(tabela).max().getAsInt());
        System.out.println("Minimalna liczba to: "+ Arrays.stream(tabela).min().getAsInt());
        System.out.println("Srednia to: "+ Arrays.stream(tabela).average().getAsDouble());

    }
    public static void zad5(){
    int liczba1=0,liczba2=0,dzialanie=0;
    double wynik=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Podaj pierwsza liczbe");
    liczba1=input.nextInt();
    input.nextLine();
    System.out.println("Podaj druga liczbe");
    liczba2=input.nextInt();
    input.nextLine();
    System.out.println("Podaj dzialanie:\n1.Dodawanie\n2.Odejmowanie\n3.Mnozenie\n4.Dzielenie");
    dzialanie=input.nextInt();
    if(dzialanie==1){
        wynik=liczba1+liczba2;
    } else if(dzialanie==2) {
        wynik=liczba1-liczba2;
    } else if (dzialanie==3) {
        wynik=liczba1*liczba2;
    }else if(dzialanie==4){
        if (liczba2<0){
            System.out.println("Nie mozna dzielic przez zero");
        }
        else {
            wynik = (double) liczba1 / (double) liczba2;
        }
    }else {
        System.out.println("Podana zla wartosc");
    }
    System.out.printf("Wynik to: %.2f\n",wynik);
    }
    public static void zad6(){
        boolean petla=false;
        int raty=0,kwota=0;
        Scanner input = new Scanner(System.in);
        while(petla==false) {
            System.out.println("Podaj kwote(max 300tys.):");
            kwota = input.nextInt();
            if(kwota>300000||kwota<0) {
            System.out.println("Podano niepoprawna wartosc. Podaj ja ponownie");
            }
            else {
                petla=true;
            }
        }
        petla=false;
        while (petla==false){
            System.out.println("Podaj ilosc rat(max 96)");
            raty=input.nextInt();
            if(raty>96||raty<0) {
                System.out.println("Podano niepoprawna wartosc. Podaj ja ponownie");
            }
            else {
                petla=true;
            }
        }
        double wynik=0;
        if(raty<24){
            wynik=(double) kwota*1.02;
        } else if (raty>=24&&raty<48) {
            wynik=(double) kwota*1.03;
        }else if (raty>=48&&raty<60) {
            wynik=(double) kwota*1.04;
        }else if (raty>=60&&raty<72) {
            wynik=(double) kwota*1.05;
        }else{
            wynik=(double) kwota*1.06;
        }
        System.out.printf("Kwota to zaplacenia to: %.2f zl\n",wynik);
    }
}

