package socketTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        var inetAdress = Inet4Address.getByName("localhost");
        try(
                var socket = new Socket("192.168.0.129",7777);
                var outputStream = new DataOutputStream(socket.getOutputStream());
                var inputStream = new DataInputStream(socket.getInputStream());
                var scanner = new Scanner(System.in);
                ){
            while(scanner.hasNextLine()) {
                var request = scanner.nextLine();
                outputStream.writeUTF(request);
                var responce = inputStream.readUTF();
                System.out.println("Responce from sever: " + responce);
            }

        }
    }
}
