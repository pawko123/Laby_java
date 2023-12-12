package Lab_10;
public class Watek extends Thread{
    public int nrwatku;
    static int id=1;
    long data;
    public Watek(){
        data=System.currentTimeMillis();
        nrwatku=id++;
    }
    @Override
    public String toString(){
        return "watek:"+nrwatku+" godzina:"+data;
    }
    @Override
    public void run(){
        System.out.println(this.toString());
        try{Thread.sleep(300);}
        catch (InterruptedException e){}
    }
}
