package ExceptionHandeling;


public class Excep_4 {

	/**
	 * @param args
	 */
	public static int[] rotate(int[] a,int n){
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++){
			if(n==b.length) n=0;
			b[i]=a[n++];
		}
		return b;
		
	}
	public static void main(String aa[]){
	  int[] array=new int[5];
	  for(int i=4;i<9;i++){
		  array[i-4]=i;
	  }
	  for(int i=0;i<array.length;i++)
		  System.out.print(array[i]);
	  System.out.println();
	  array=rotate(array,2);
	  for(int i=0;i<array.length;i++)
	  System.out.print(array[i]);
}
}