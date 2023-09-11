import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        String domain = inputStream.readUTF();

        InetAddress iNet = InetAddress.getByName(domain);
        String ip = iNet.getHostAddress();

        System.out.println(iNet + " " + ip);
    }
}
