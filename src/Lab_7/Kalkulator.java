package Lab_7;

import java.util.Arrays;

public class Kalkulator {
    public double[] liczby;

    public Kalkulator(int liczba1) {
        this.liczby = new double[]{liczba1};
    }
    public Kalkulator(int liczba1,int liczba2,int liczba3,int liczba4) {
        this.liczby = new double[]{liczba1,liczba2,liczba3,liczba4};
    }
    public Kalkulator(int liczba1,int liczba2,int liczba3,int liczba4,int liczba5,int liczba6,int liczba7) {
        this.liczby = new double[]{liczba1,liczba2,liczba3,liczba4,liczba5,liczba6,liczba7};
    }
    public Kalkulator(Kalkulator oryginal){
        this.liczby= Arrays.copyOf(oryginal.liczby,oryginal.liczby.length);
    }

}
