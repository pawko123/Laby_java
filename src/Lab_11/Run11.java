package Lab_11;

public class Run11 {
   public Run11(){
//        Wyjatek_dzielenia test=new Wyjatek_dzielenia();
//        test.dzielenie(10,2);
//        test.dzielenie(10,0);
//        try {
//            int wartosc = 69;
//            if(wartosc==69){
//                throw new Mojwyjatek("hehe69");
//            }
//        }
//        catch (Mojwyjatek e){
//            System.out.println(e);
//        }

        int port=6666;

       Thread serverThread = new Thread(() -> {
           Server server = new Server();
           server.polaczenie(port);
       });

       // Wątek dla klienta
       Thread clientThread = new Thread(() -> {
           Client client = new Client();
           client.polaczenie(port);
       });
       serverThread.start();
       clientThread.start();
    }
}
