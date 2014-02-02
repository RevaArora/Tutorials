package ExceptionHandeling;

public class Excep_3 {

	/**
	 * throwing user defined exception using throw
	 */
	public static void validate(int a){
		if(a<18){
			throw new ArithmeticException("not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  validate (12);
  System.out.println("rest of code");
 
	}

}
