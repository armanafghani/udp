import java.net.*;
import java.io.*;


public class RawListener {
	public static void main(String agrs[]){
		System.out.println("Starting listener...\n");
		int port=5555;
		DatagramSocket socket;

		socket = null;

		boolean started = false;
		while(true) {
			DatagramPacket packet=new DatagramPacket(new byte[512],512);
			try {
				  if (!started) {
				  	System.out.format("SUCCESS!\nListening on port: %d\n\n", port);
				 	started = true;
				  }
				  socket=new DatagramSocket(port);
				  socket.receive(packet);
				  String message = new String(packet.getData(),0,packet.getLength());
				  System.out.println(message);
				  socket.close();
			} 
			catch(IOException e) {
				  e.printStackTrace();
			}  
		}  
	}
}
