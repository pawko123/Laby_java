package Lab_8;

import java.util.ArrayList;

public class Lista_studentow {
    public ArrayList<Student> lista;
    public Lista_studentow(){
        lista=new ArrayList<Student>();
    }
    public int ilu_studentow(){
        return lista.size();
    }
    public void studentnr3(){
        Student temp=lista.get(2);
        System.out.println("Dane 3 studenta:");
        System.out.println(temp.toString());
    }
}
