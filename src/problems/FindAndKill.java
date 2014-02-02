package problems;


import java.io.*;
import java.util.Scanner;

public class FindAndKill {

	/**this program finds a string from a list of files and kill it.
	 * (actually it replaces with a sting  which is either "", or any other string)
	 * @param args
	 */
	static String rep(String init){ String avg="";
	if(init.contains(originalString)){
		 avg=init.replaceAll(originalString,ReplacingString);
		System.out.println(avg);
		}
	return avg ;
		}
	static String originalString="Orbit";
	static String ReplacingString="ChatterBox";
	public static void main(String[] aa) {
		// TODO Auto-generated method stub
		
		try{
			
		InputStream in=(new FileInputStream(""+aa[0]+""));
		 OutputStream f0=new FileOutputStream(""+rep(aa[0])+"");
		
    	   Scanner input=new Scanner(in);
              while(input.hasNext()){
       String test=input.nextLine();
       test=rep(test);
           	    test=test+"\n"; //System.out.println(test);
           	     byte buf[]=test.getBytes();
           	  	   f0.write(buf);
           	 //  System.out.print(test);
      	} in.close(); f0.close();
		}catch(Exception ex){System.out.println(ex);}
		
}
}
