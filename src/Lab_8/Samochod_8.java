package Lab_8;

import Lab_5.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

class Samochod_8 {
    private String marka;
    private String model;
    private double pojemnoscsilnika;
    private String typnadwozia;
    private String typsilnika;
    private int rokprodukcji;
    private Data data1rejestracji;
    private int cena;
    public Samochod_8(){
        this.marka="Opel";
        this.model="Corsa";
        this.pojemnoscsilnika=1.6;
        this.typnadwozia="hatchback";
        this.typsilnika="benzyna";
        this.rokprodukcji=2022;
        this.data1rejestracji=new Data(16,11,2021);
        this.cena=50000;
    }
    public Samochod_8(String marka, String model, double pojemnoscsilnika, String typnadwozia, String typsilnika,
                    int rokprodukcji, int dzien,int miesiac,int rok, int cena) {
        this.marka = marka;
        this.model = model;
        this.pojemnoscsilnika = pojemnoscsilnika;
        this.typnadwozia = typnadwozia;
        this.typsilnika = typsilnika;
        this.rokprodukcji = rokprodukcji;
        this.data1rejestracji = new Data(dzien,miesiac,rok);
        this.cena = cena;
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
        this.data1rejestracji = new Data(d,m,r);
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
    public Data getdata1rejestracji() {
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
