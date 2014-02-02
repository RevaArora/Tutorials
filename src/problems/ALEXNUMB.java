package problems;

import java.util.Scanner;

public class ALEXNUMB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
     Scanner input=new Scanner(System.in);
        int T= input.nextInt();
          for(int i=0;i<T;i++){
        	  a=input.nextDouble();
        	  for(int j=0;j<a;j++) input.nextInt();
        	  System.out.println(a*(a-1)/2);
        	
          }
	}
}
