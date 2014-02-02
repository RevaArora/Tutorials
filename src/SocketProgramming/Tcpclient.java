package SocketProgramming;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Tcpclient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg;
  try {
	Socket c=new Socket("127.0.0.1",5001);
	BufferedReader in =new BufferedReader(new InputStreamReader(c.getInputStream()));
	PrintWriter out=new PrintWriter(new OutputStreamWriter(c.getOutputStream()));
	 Scanner clientinput=new Scanner(System.in);
	 while(true){
	 System.out.println("Enter:");
	 msg=clientinput.nextLine();
	 out.println(msg);
	 out.flush();
	 //for recieving msg
	 msg=in.readLine();
	 System.out.println(msg);
	 }
	 
} catch (Exception e) {
	// TODO Auto-generated catch block
	
	e.printStackTrace();

   }
	}
}
