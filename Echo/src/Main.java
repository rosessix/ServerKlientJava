import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        String host = "localhost";
        Socket socket = new Socket(host, port);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast noget:");
        String text = input.next();

        out.writeUTF(text);
        System.out.println(in.readDouble());
    }
}