package Lab_12;

import Lab_7.Reader_Writer;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Formularz extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField imie;
    private JTextField nazwisko;
    private JTextField zatrudnienie;
    private JTextField stanowisko;
    private JTextField ulica;
    private JTextField miasto;
    private JTextField kod;
    private JTextField wojewodztwo;
    private JTextField kraj;
    private JTextField telefon;
    private JTextField email;
    private JTextField www;
    private JButton przeslijplik;
    private JButton wyczysc;
    private JButton wyslij;
    private JLabel imie_l;
    private JLabel naz_l;
    private JLabel zatrudnienie_l;
    private JLabel stanowisko_l;
    private JLabel ulica_l;
    private JLabel miasto_l;
    private JLabel kod_l;
    private JLabel wojewodztwo_l;
    private JLabel kraj_l;
    private JLabel telefon_l;
    private JLabel email_l;
    private JLabel www_l;
    private JLabel error;

    public Formularz(){
        setContentPane(panel1);
        setTitle("Formularz");
        setSize(410,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        przeslijplik.addActionListener(this);
        wyslij.addActionListener(this);
        wyczysc.addActionListener(this);
    }
    public static void main(String[] args){
        new Formularz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==wyslij){
            if(imie.getText() .isEmpty() || nazwisko.getText() .isEmpty() || zatrudnienie.getText() .isEmpty() || stanowisko.getText()
                    .isEmpty() || ulica.getText() .isEmpty() || miasto.getText() .isEmpty() || kod.getText() .isEmpty() || wojewodztwo.getText() .isEmpty() || kraj.getText()
                    .isEmpty() || telefon.getText() .isEmpty() || email.getText() .isEmpty() || www.getText().isEmpty()) {
                error.setText("Złe wartości");
            }
            else {
                String zapis_do_csv = imie.getText() + ',' + nazwisko.getText() + ',' + zatrudnienie.getText() + ',' + stanowisko.getText()
                        + ',' + ulica.getText() + ',' + miasto.getText() + ',' + kod.getText() + ',' + wojewodztwo.getText() + ',' + kraj.getText()
                        + ',' + telefon.getText() + ',' + email.getText() + ',' + www.getText()+'\n';
                System.out.println(zapis_do_csv);
                Reader_Writer wysylanie = new Reader_Writer();
                wysylanie.zapis("C:\\Users\\games\\IdeaProjects\\Laby_java\\src\\Lab_12\\plik_osoby.csv", zapis_do_csv);
                error.setText("");
            }
        }
        if(e.getSource()==przeslijplik){
            JFileChooser wyborpliku=new JFileChooser();
            wyborpliku.setFileSelectionMode(JFileChooser.FILES_ONLY);
            wyborpliku.addChoosableFileFilter(new FileNameExtensionFilter("Images(jpg,png,gif,bmp)", "jpg", "png", "gif", "bmp"));
            wyborpliku.setAcceptAllFileFilterUsed(false);
            int response=wyborpliku.showOpenDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File plik=new File(wyborpliku.getSelectedFile().getAbsolutePath());
                System.out.println(plik);
            }
        }
        if(e.getSource()==wyczysc){
            imie.setText("");
            nazwisko.setText("");
            zatrudnienie.setText("");
            stanowisko.setText("");
            ulica.setText("");
            miasto.setText("");
            kod.setText("");
            wojewodztwo.setText("");
            kraj.setText("");
            telefon.setText("");
            email.setText("");
            www.setText("");
        }
    }
}