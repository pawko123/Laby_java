package Kolos_2;

public class Watki implements Runnable{
    public int numer_watku;
    public int wynik;
    public Watki(int nr){
        this.numer_watku=nr;
        this.wynik=0;
    }

    @Override
    public void run() {
        if(numer_watku==1){
            for(int i=1;i<=1000;i++){
                wynik+=i;
            }
        }
        if(numer_watku==2){
            for(int i=1000;i>=1;i--){
                wynik-=i;
            }
        }
    }
    public static void main(String[] args){
        Watki w1=new Watki(1);
        Watki w2=new Watki(2);
        Thread watek1=new Thread(w1);
        Thread watek2=new Thread(w2);
        try {
            watek1.start();
            watek1.join();
            watek2.start();
            watek2.join();
        }
        catch (InterruptedException e){
            System.out.println("syzyf");
        }
        System.out.println(w1.wynik+w2.wynik);
    }
}
