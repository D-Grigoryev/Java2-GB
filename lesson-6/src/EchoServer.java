import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Сервер запущен");
            Socket socket= serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner scan = new Scanner(System.in);
            new Thread(()->{
        while (true){
            String str = null;
            try {
                str = in.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Клиент: "+str);

            if (str.equals("/end")){
                break;
            }
        }

    }).start();
            new Thread(()->{
                while (true){
                    String s = scan.nextLine();
                    if (!s.isEmpty()){
                        try {
                            out.writeUTF("Cервер: "+s);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }).start();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
