package SocketProgramming;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPclient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DatagramPacket pac;
  byte[] msg;
  int PORT =7;
  try {
	DatagramSocket s=new DatagramSocket();
	InetAddress ad=InetAddress.getByName("127.0.0.1");
	while(true){
		//for send
		msg=new byte[50];
		System.out.println("Enter: ");
		System.in.read(msg);
		pac =new DatagramPacket(msg,50,ad,PORT);
		s.send(pac);
		//for recieve
		msg=new byte[50];
		pac=new DatagramPacket(msg,50);
		s.receive(pac);
		System.out.println(msg);
		
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

}
