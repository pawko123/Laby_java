package Kolos_2;

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Slodycze slodycz=new Slodycze();
        slodycz.setproducent(scanner.next());
        slodycz.setnazwa(scanner.next());
        slodycz.setcena(scanner.nextDouble());
        slodycz.settyp(scanner.next());
    }
}
