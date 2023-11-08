package Lab_4;

import java.util.Random;

public class lab4 {
    public static void zad1(){
        int[] tablica=new int[30];
        Random generator=new Random();
        for(int i=0;i<30;i++){
            tablica[i]=generator.nextInt(52)+99;
        }
        int[] kopia=new int[30];
        int i=0;
        for(int element:tablica){
            kopia[i]=element;
            i++;
        }
        for(int element:tablica){
            System.out.printf("%d ",element);
        }
    }
    public static void zad2(){
        int[][] tablica=new int[7][7];
        int[] max_kolumn=new int[7];
        int[] min_kolumn=new int[7];
        Random generator=new Random();
        int max=0,min=151,suma=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                tablica[i][j]= generator.nextInt(52)+99;
                suma+=tablica[i][j];
                if(tablica[i][j]<min){
                    min=tablica[i][j];
                }
                if (tablica[i][j]>max){
                    max=tablica[i][j];
                }
            }
        }
        double srednia=(double)suma/49.0;
        int powyzej_sredniej=0,ponizej_sredniej=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(tablica[i][j]>srednia){
                    powyzej_sredniej++;
                }
                if(tablica[i][j]<srednia){
                    ponizej_sredniej++;
                }
                max_kolumn[j]=tablica[i][j];
                min_kolumn[j]=tablica[i][j];
            }
        }
        for(int i=1;i<7;i++){
            for(int j=0;j<7;j++){
                if(tablica[i][j]>max_kolumn[j]){
                    max_kolumn[j]=tablica[i][j];
                }
                if(tablica[i][j]<min_kolumn[j]){
                    min_kolumn[j]=tablica[i][j];
                }
            }
        }
        System.out.println("Tablica 7x7");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.printf("%4d",tablica[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("Wartosci maksymalne");
        for(int i=0;i<7;i++){
            System.out.printf("%4d",max_kolumn[i]);
        }
        System.out.println("\nWartosci minimalne");
        for(int i=0;i<7;i++){
            System.out.printf("%4d",min_kolumn[i]);
        }
        System.out.println("\nWartosc maksymalna: "+max);
        System.out.println("Wartosc minimalna: "+min);
        System.out.println("Srednia: "+srednia);
        System.out.println("Liczb wiekszych od sredniej: "+powyzej_sredniej);
        System.out.println("Liczb mniejszych od sredniej: "+ponizej_sredniej);
    }
    public static void zad3(){
        int[] tablica=new int[40];
        Random generator=new Random();
        for (int i = 0; i < 11; i++) {
            tablica[i] = generator.nextInt(5) + 1;
        }
        for (int i = 11; i < 21; i++) {
            tablica[i] = generator.nextInt(5) + 6;
        }
        for (int i = 21; i < 31; i++) {
            tablica[i] = generator.nextInt(45) + 11;
        }
        for (int i = 31; i < 40; i++) {
            tablica[i] = generator.nextInt(16) + 60;
        }
        for (int element:tablica){
            System.out.printf("%3d",element);
        }
    }
    static void swap(int[] tablica,int index1,int index2){
        int temp = tablica[index1];
        tablica[index1] = tablica[index2];
        tablica[index2] = temp;
    }
    static void wypisz(int[] tablica){
        for(int element:tablica){
            System.out.printf("%d ",element);
        }
        System.out.printf("\n");
    }
    static void quicksort(int[] tablica,int lewy,int prawy,int glebokosc){
        if (lewy < prawy) {
            int pivot = tablica[prawy];
            int i = lewy - 1;
            for (int j = lewy; j < prawy; j++) {
                if (tablica[j] < pivot) {
                    i++;
                    swap(tablica, i, j);
                }
            }
            swap(tablica, i + 1, prawy);
            int indeksPodzialu = i + 1;
            if (glebokosc < 2) {
                wypisz(tablica);
            }
            quicksort(tablica, lewy, indeksPodzialu - 1,glebokosc+1);
            quicksort(tablica, indeksPodzialu + 1, prawy,glebokosc+1);
        }
    }
    static void bubblesort(int[] tablica){
        int dlugosc=tablica.length;
        int temp;
        for (int i = 0; i < dlugosc - 1; i++) {
            for (int j = 0; j < dlugosc - i - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    swap(tablica,j,j+1);
                }
            }
            if(i<2) {
                System.out.println("Przejscie nr"+(i+1));
                wypisz(tablica);
            }
        }
    }
   public static void zad4(){
       int[] tablica=new int[30];
       Random generator=new Random();
       for(int i=0;i<30;i++){
           tablica[i]=generator.nextInt(52)+99;
       }
       int[] kopia=new int[30];
       int i=0;
       for(int element:tablica){
           kopia[i]=element;
           i++;
       }
       System.out.println("Sortowanie babelkowe");
       wypisz(tablica);
       bubblesort(tablica);
       wypisz(tablica);
       i=0;
       for (int element:kopia){
           tablica[i]=element;
           i++;
       }
       System.out.println("Sortowanie szybkie");
       wypisz(tablica);
       quicksort(tablica,0,tablica.length-1,0);
       wypisz(tablica);
   }
}
