package Kolos_2;

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Ciastka ciastko=new Ciastka();
        ciastko.setproducent(scanner.next());
        ciastko.setnazwa(scanner.next());
        ciastko.setcena(scanner.nextDouble());
        ciastko.settyp(scanner.next());
        ciastko.setkod(scanner.nextInt());
    }
}
