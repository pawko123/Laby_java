package Lab_10;

import java.util.ArrayList;

public class Katalog {
    ArrayList<Gra> katalog_gier;
    public Katalog(){
        katalog_gier=new ArrayList<Gra>();
        katalog_gier.add(new Gra("Wiedźmin 3", "RPG", "CD Projekt", "CD Projekt", 2015));
        katalog_gier.add(new Gra("Cyberpunk 2077", "RPG", "CD Projekt", "CD Projekt", 2020));
        katalog_gier.add(new Gra("The Legend of Zelda: Breath of the Wild", "Action-Adventure", "Nintendo", "Nintendo", 2017));
        katalog_gier.add(new Gra("Red Dead Redemption 2", "Action-Adventure", "Rockstar Games", "Rockstar Games", 2018));
        katalog_gier.add(new Gra("Minecraft", "Sandbox", "Mojang", "Mojang", 2011));
    }
}
