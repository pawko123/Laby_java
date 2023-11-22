package Lab_6;

import java.util.ArrayList;
import java.util.List;

public class Programy_pralki {
    List<Program> lista_programow;

    public Programy_pralki() {
        //tworzy 5 podstawowych programow
        lista_programow=new ArrayList<>();
        lista_programow.add(new Program("Bawelna",30,5,25,true,1000));
        lista_programow.add(new Program("Syntetyczne",60,10,40,true,1000));
        lista_programow.add(new Program("Dzienne pranie 45min",30,10,35,false,800));
        lista_programow.add(new Program("Dzienne pranie 30min",20,5,25,false,800));
        lista_programow.add(new Program("Czyszczenie bebna",90,5,25,false,400));
    }
    public void wypisz_programy(){
        int nr_programu=1;
        for(Program program:this.lista_programow){
            System.out.println("Nr programu: "+nr_programu);
            
            nr_programu++;
        }
    }
}
