package SocketProgramming;


import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DatagramPacket pac;
  byte[] msg;
  int PORT=7;
  try {
	DatagramSocket s=new DatagramSocket(PORT);
	while(true){
		//for recive
		msg=new byte[50];
		pac=new DatagramPacket(msg,50);
		s.receive(pac);
		//for sending
		msg=new byte[50];
		System.out.println("Server:");
		System.in.read(msg);
		pac=new DatagramPacket(msg,50,pac.getAddress(),pac.getPort());
		s.send(pac);
		}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

}
