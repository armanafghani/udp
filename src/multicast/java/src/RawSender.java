import java.io.*;
import java.net.*;
import java.util.*;
 
public class RawSender {

 
    public static void main(String[] args) {
            int port = 5555;

            DatagramSocket socket;
            socket = null;
            try {
                socket = new DatagramSocket(port);
                socket.setBroadcast(true);
                socket.connect(InetAddress.getByName("255.255.255.255"), 5555);
            }
            catch (Exception e) {
                System.err.println("Connection failed. " + e.getMessage());
            }

            while (true) {
                String message = "hey";
                byte[] buf= message.getBytes();

                DatagramPacket packet= new DatagramPacket(buf, buf.length);
                try{
                    socket.send(packet);
                }catch(Exception e){
                    System.err.println("Sending failed. " + e.getMessage());
                }
            }


        }
}