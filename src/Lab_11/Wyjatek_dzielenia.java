package Lab_11;

public class Wyjatek_dzielenia {
    public void dzielenie(int l,int m){
        try{
            System.out.println(l/m);
        }
        catch (ArithmeticException e){
            System.out.println("Nie dziel przez 0");
        }
    }
}
