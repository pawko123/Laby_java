package Lab_11;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server{
    public void polaczenie(int port) {
        try{
            ServerSocket server=new ServerSocket(port);
            Socket client=server.accept();
            System.out.println("client connected");
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("Wysłano komunikat do klienta");
            Scanner in = new Scanner(new InputStreamReader(client.getInputStream()));
            String response = in.nextLine();
            if ("Nawiązano komunikację i wysłano odpowiedź".equals(response)) {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e){

                }
                out.println("Połączenie zatwierdzone");
            } else {
                System.out.println("Zła odpowiedź od klienta. Zamykanie serwera.");
            }
            System.out.println("Odpowiedź od klienta: " + response);
            server.close();
            client.close();
        }
        catch (IOException e){
            System.out.println("Blad");
        }
    }
}
