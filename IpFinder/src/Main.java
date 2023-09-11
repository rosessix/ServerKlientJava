import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        String host = "localhost";
        Socket socket = new Socket(host, port);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        Scanner input = new Scanner(System.in);
        String domain = input.next();

        outputStream.writeUTF(domain);
    }
}