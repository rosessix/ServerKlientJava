import java.io.*;
import java.net.Socket;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        String host = "localhost";
        Socket socket = new Socket(host, port);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        System.out.println(inputStream.readUTF());

    }
}