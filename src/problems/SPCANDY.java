package problems;
import java.math.BigDecimal;
import java.util.Scanner;
public class SPCANDY {



	

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner in=new Scanner(System.in);
 BigDecimal N=new BigDecimal(8.0);
 BigDecimal K=new BigDecimal(8.0);
 BigDecimal Check=new BigDecimal(0.0);
 int T=in.nextInt();
 for(int  i=0;i<T;i++){
     
      N=in.nextBigDecimal();// no of candy
      K=in.nextBigDecimal();//no of student
     
      try{
      BigDecimal R[]=N.divideAndRemainder(K);
      System.out.println(R[0]+" "+R[1]);
      }catch (Exception e){System.out.println("0 "+N);}
	}

}
}
