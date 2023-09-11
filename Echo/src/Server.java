import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        DataInputStream in;
        DataOutputStream out;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();

        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        out.writeDouble(13.0);

        System.out.println(in.readUTF());

    }
}
