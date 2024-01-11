package Lab_11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
    public void polaczenie(int port) {
        try {
            Socket client = new Socket("localhost", port);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("Nawiązano komunikację i wysłano odpowiedź");
            try{
                Thread.sleep(120000);
            }
            catch (InterruptedException e){

            }
            out.println("Koncze prace");
            client.close();
        }
        catch (IOException e){
            System.out.println("Blad");
        }
    }
}
