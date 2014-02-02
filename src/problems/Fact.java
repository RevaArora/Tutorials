package problems;

import java.util.*;


 class Fact {

	/**
	 * @param args
	 */
	static Set<Integer> fa=new HashSet<Integer>();
	 static Iterator<Integer> itr= fa.iterator();
	public static void Factor(int r){
		for(int i=1;i<=r;i++){
			if(r%i==0){
				fa.add(i);
		       }	
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       int k=input.nextInt();
       for(int m=0;m<k;m++){
         int n=input.nextInt();
         int a[]=new int[n+1];
         int digit=1;
         for(int i=0;i<n;i++){
           a[i]=input.nextInt();
            Factor(a[i]);
            digit=digit*a[i];
         }Factor(digit);
         System.out.println(fa.size());
         fa.clear();
	}
	}
}
