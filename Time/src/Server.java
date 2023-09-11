import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        LocalTime time = LocalTime.now();
        //System.out.println(time);

        outputStream.writeUTF(String.valueOf(time));

        socket.close();
    }
}
