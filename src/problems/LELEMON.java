package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LELEMON {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m=new ArrayList<Integer>();
    Scanner in=new Scanner(System.in);
    int sum=0;
      int n=in.nextInt();
      long mint=in.nextLong();
     
      for(int i=0;i<mint;i++){
        m.add(in.nextInt()); 
      }
    
      //for n rooms <-- problem area
      long multi[][]=new long[n][100];
      for(int i=0;i<n;i++){
    	int noofbottle  =in.nextInt();
    	for(int j=0;j<noofbottle;j++){
    		//System.out.println(i+" "+j);
    		multi[i][j]=in.nextLong(); 
    	} 
    	Arrays.sort(multi[i]);
      }
      //checking
      for(int i=0;i<n;i++){
    	  for(int j=0;j<8;j++){
    		  System.out.print(multi[i][j]);
    	  } System.out.println(" ");
      }//checking ended
        //processing
       Iterator<Integer> itr=m.iterator();
        while(itr.hasNext()){
        	int temp=itr.next();
        	 sum+=multi[temp][99]; System.out.println(multi[temp][99]);
        	 multi[itr.next()][99]=(Long) null;
        	 Arrays.sort(multi[temp]);
        	
        }
       
        System.out.println(sum+" "+m);  
	}

}
