package Lab_8;

public class Student {
    public String imie;
    public String nazwisko;
    public static int id=1;
    public int id_stud;
    public Student(String i,String n){
        imie=i;
        nazwisko=n;
        id_stud=id++;
    }
    public String toString(){
        return imie+"\n"+nazwisko+"\n"+id_stud;
    }
}
