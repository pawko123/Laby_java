package Lab_5;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;
    public Data(int d, int m, int r){
        this.dzien=d;
        this.miesiac=m;
        this.rok=r;
    }
    public int getdzien() {
        return dzien;
    }
    public int getmiesiac() {
        return miesiac;
    }
    public int getrok() {
        return rok;
    }
    public String toString() {
        return dzien+"-"+miesiac+"-"+rok;
    }
}
