package introduction;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream br=(new FileInputStream(new File("speak2")));
		 OutputStream f0=new FileOutputStream("speak.txt");
		 while(!(br.available()==0)){
		char name= (char) br.read();
     //output on console , child's play :P  System.out.println(name);
       //lets write it in file say "speak"
      
       
       f0.write( name );}
		 br.close();
       f0.close();
       
	}

}
