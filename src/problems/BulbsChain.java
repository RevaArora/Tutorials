package problems;

import java.util.Scanner;

public class BulbsChain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
 // String Ai="x";
 // String Bi="asdf";
		String Ai=input.next();
		String Bi=input.next();
         String ai=Ai.substring(0,Ai.length());
         String bi=Bi.substring(0,Bi.length());
      int Out=transform(Ai,Bi);  
        System.out.println(Out);
	}

	private static int transform(String ai, String bi) {
		// TODO Auto-generated method stub
		if(ai.length()<=0||bi.length()<=0)
		{
		return 0;
		} else {
		 String m1 = ai.substring(0,ai.length()-1);
		 String n1 = bi.substring(0,bi.length()-1);
		 
			return 1+min(transform(m1,bi),transform(ai,n1),transform(m1,n1));
	}
	}

	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		if( (i<j)&& (i<k) )
		return i;
		if((j<i)&&(j<k) )
			return j;
		else return k;
		}
	}

	

	

	

