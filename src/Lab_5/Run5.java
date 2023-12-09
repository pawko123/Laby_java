package Lab_5;

public class Run5 {
    public Run5(){
        //komis
        Samochod Opelek=new Samochod();
        Autokomis komis=new Autokomis();
        komis.samochody.add(Opelek);
        komis.samochody.add(new Samochod("Toyota","Corolla",1.8,
                "sedan","benzyna",2022,1,1,2022,50000));
        komis.samochody.add(new Samochod("Ford","Focus",1.6,
                "hatchback","diesel",2021,15,6,2021,45000));
        //naprawa programu
        Rectangle myRect=new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("Obszar kwadratu: " + myRect.area());
    }
}
