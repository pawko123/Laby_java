package Lab_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void slowa_zdania() {
        String zdanie = "Z podanego zdania nalezy wyodrebnic zawarte w nim slowa stosujac wyrazenie regularne";
        String regex = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zdanie);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public void adres_email(String mail){
        String regex="[a-zA-Z0-9.]*@[a-zA-Z0-9.]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if(matcher.find()){
            System.out.println("To jest email");
        }
        else {
            System.out.println("To nie jest email");
        }
    }
}