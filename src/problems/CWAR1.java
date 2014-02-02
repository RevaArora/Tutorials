package problems;

public class CWAR1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          long  n=183445,k=12;
          long r=k(n,k);
          System.out.println(r);
	}

	 static long k(long n, long k) {
		// TODO Auto-generated method stub
		if(n==k||k==1){
			return n;
		}
		else
			return k(n-1,k)+k(n-1,k-1);
		
	}

}
