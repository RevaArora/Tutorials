package problems;

import java.util.Scanner;

public class RIGHTRI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         int res=0;
         long N=in.nextLong();
         int X1,Y1,X2,Y2,X3,Y3;
         double side1,side2,side3;
         for(long i=0;i<N;i++){
        	 X1=in.nextInt();
        	 Y1=in.nextInt();
        	 X2=in.nextInt();
        	 Y2=in.nextInt();
        	 X3=in.nextInt();
        	 Y3=in.nextInt();
        	 side1=Math.pow((X1-X2), 2)+Math.pow((Y1-Y2), 2);
        	 side2=Math.pow((X2-X3), 2)+Math.pow((Y2-Y3), 2);
        	 side3=Math.pow((X3-X1), 2)+Math.pow((Y3-Y1), 2);
        	 
        	 if((side1==side2+side3)||(side2==side1+side3)||(side3==side2+side1)){
        		 res++;
        	 }
         }
         System.out.println(res);
	}

}
