package problems;

public class Prime {

	/**this program determines if the number is prime,
	 * also it lists all the prime numbers to a rannge
	 * @param args
	 */
	static int limit=22; //the number to which we want condition of prime
	public static int isPrime(int a){

        for(int i=2;i<a;i++){
      	  if(a%i==0){
      		  System.out.println(a+" is a prime number, divisible by "+i);
      		return a;
      	  }else{}
        }System.out.println(a+" is prime number");
		
        return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int a=2;a<limit;a++){
        	 isPrime(a);
         }

    }
}
