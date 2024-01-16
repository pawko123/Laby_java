package Kolos_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static void usun_specjalne(String napis){
        String regex="[!@#$%]";
        Pattern wzor=Pattern.compile(regex);
        Matcher matcher= wzor.matcher(napis);
        System.out.println(matcher.replaceAll(""));
    }
    static void sprawdz_poprawnosc(String napis){
        String regex="^[0-9]{3}-[0-9]{3}-[0-9]{3}$";
        Pattern wzor=Pattern.compile(regex);
        Matcher matcher= wzor.matcher(napis);
        if (matcher.find()){
            System.out.println("Podany numer jest prawidlowy");
        }
        else {
            System.out.println("Podany numer nie jest prawidlowy");
        }
    }
    public static void main(String[] args){
         Regex.usun_specjalne("napis !!!test #$@%pls dzialaj");
         Regex.sprawdz_poprawnosc("333-333-333");
         Regex.sprawdz_poprawnosc("333333333");
    }
}
