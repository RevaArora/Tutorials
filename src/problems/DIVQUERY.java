package problems;

import java.util.ArrayList;
import java.util.Scanner;



public class DIVQUERY {
public static void Cal(int L,int R,int K){
	int temp,res=0;
		while(L<=R){
			temp=A.get(L-1);
			if(temp%K==0){
				res++;
			} L++;
		}
		System.out.println(res);
	}
 static ArrayList<Integer> A=new ArrayList<Integer>();
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L,R,K;
		  Scanner in=new Scanner(System.in);
		  long N=in.nextLong();
		  long Q=in.nextLong();
		 // System.out.println("got N l ");
		  while(N>0){
			  A.add(in.nextInt());
			  N--;
		  }
		  // System.out.println(A);
		while(Q>=0){
		 L=in.nextInt();
		 R=in.nextInt();
		 K=in.nextInt();
		    Cal(L,R,K);
		 
			Q--;// System.out.println("Q down "+Q);
		}
	}
}
	