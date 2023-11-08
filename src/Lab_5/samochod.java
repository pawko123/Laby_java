package Lab_5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class samochod {
    private String marka;
    private String model;
    private double pojemnoscsilnika;
    private String typnadwozia;
    private String typsilnika;
    private int rokprodukcji;
    private data data1rejestracji;
    private int cena;
    public samochod(){
        this.marka="Opel";
        this.model="Corsa";
        this.pojemnoscsilnika=1.6;
        this.typnadwozia="hatchback";
        this.typsilnika="benzyna";
        this.rokprodukcji=2022;
        this.data1rejestracji=new data(9,11,2021);
        this.cena=50000;
    }
    //settery
    public void setmarka(String marka) {
        this.marka = marka;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public void setpojemnoscsilnika(double pojemnoscsilnika) {
        this.pojemnoscsilnika = pojemnoscsilnika;
    }
    public void settypnadwozia(String typnadwozia) {
        this.typnadwozia = typnadwozia;
    }
    public void settypsilnika(String typsilnika) {
        this.typsilnika = typsilnika;
    }
    public void setrokprodukcji(int rokprodukcji) {
        this.rokprodukcji = rokprodukcji;
    }
    public void setdata1rejestracji(int d,int m,int r) {
        this.data1rejestracji = new data(d,m,r);
    }
    public void setcena(int cena) {
        this.cena = cena;
    }
    //gettery
    public String getMarka() {
        return marka;
    }
    public String getmodel() {
        return model;
    }
    public double getpojemnoscsilnika() {
        return pojemnoscsilnika;
    }
    public String gettypnadwozia() {
        return typnadwozia;
    }
    public String gettypsilnika() {
        return typsilnika;
    }
    public int getrokprodukcji() {
        return rokprodukcji;
    }
    public data getdata1rejestracji() {
        return data1rejestracji;
    }
    public int getcena() {
        return cena;
    }
    @Override
    public String toString() {
        return "Marka: " + marka + "\nModel: " + model + "\nPojemność silnika: " + pojemnoscsilnika
                + "\nTyp nadwozia: " + typnadwozia + "\nTyp silnika: " + typsilnika + "\nRok produkcji: " + rokprodukcji
                + "\nData 1 rejestracji: " + data1rejestracji + "\nCena: " + cena;
    }
    public void sprawdz_gwarancje(){
        Date obecna_data=new Date();
        SimpleDateFormat rok = new SimpleDateFormat("yyyy");
        SimpleDateFormat dzien = new SimpleDateFormat("dd");
        SimpleDateFormat miesiac = new SimpleDateFormat("MM");
        int dzien_int = Integer.parseInt(dzien.format(obecna_data));
        int miesiac_int = Integer.parseInt(miesiac.format(obecna_data));
        int rok_int = Integer.parseInt(rok.format(obecna_data));
        if((rok_int-this.data1rejestracji.getrok())>2){
            System.out.println("Gwarancja nie minela");
        }
        else {
            if((miesiac_int-this.data1rejestracji.getmiesiac())<0){
                System.out.println("Gwarancja nie minela");
            }
            else {
                if((dzien_int-this.data1rejestracji.getdzien())<0){
                    System.out.println("Gwarancja nie minela");
                }
                else {
                    System.out.println("Gwarancja minela");
                }
            }
        }
    }
}
