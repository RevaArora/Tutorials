package SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg;
try {
	ServerSocket s=new ServerSocket(5001);
	Socket soc=s.accept();
     while(true){
    	 BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
         PrintWriter out=new PrintWriter(new OutputStreamWriter(soc.getOutputStream()));
         msg=in.readLine();
         System.out.println("Client:"+msg);
         Scanner serverinput=new Scanner(System.in);
         System.out.println("Enter: ");
         msg=serverinput.nextLine();
         out.println(msg);
         out.flush();
     }
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


  
	}

}
