package Lab_10;

import java.util.ArrayList;
public class Odczyt implements Runnable{
    public int poczatek;
    public int koniec;
    public ArrayList<String> plik;
    public Odczyt(int p,int k,ArrayList<String> oryginal){
        poczatek=p;
        koniec=k;
        plik=new ArrayList<>(oryginal);
    }
    public void run(){
        for(int i=poczatek;i<koniec;i++){
            System.out.println(plik.get(i));
        }
    }
}
