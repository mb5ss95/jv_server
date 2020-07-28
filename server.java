import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class server {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello, World.");
        //String host = "192.168.219.101";
        int port = 3000;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();

            ObjectInputStream OIP = new ObjectInputStream(socket.getInputStream());
            Object order = OIP.readObject();

    
            System.out.println(order);
        
            System.out.println();
            serverSocket.close();
            socket.close();
        } catch (IOException exception) {}
    }
}