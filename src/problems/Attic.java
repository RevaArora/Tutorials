package problems;

import java.util.Scanner;

public class Attic {

	/** code chef problem
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        char q;
        for(int r=0;r<k;r++){
         String path=input.next();
           int count=0,y=0,x;
           
           for(int i=0;i<path.length();i++){
        	   q=path.charAt(i);
        	   x=0;
        	   if(q=='.'){
        		   while(q!='#'){
        		   x++;
        		   q = path.charAt(++i);
        		    
        		   }
        		   if(y<x){
        		   count++;
        		   y=x;
        		   }
        		   
        	   }
           }
           System.out.println(count);
	}
  }
}
