package ExceptionHandeling;

import java.util.Scanner;
public class Excep_1 {

	/** in exception handling mainly 4 things are used 
	 * try,catch
	 * finally
	 * throw
	 * throwable
	 * implementing it one by one 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
       Scanner in=new Scanner(System.in);
        System.out.println("enter two numbers to be divided");
        a=in.nextInt();
        b=in.nextInt(); //if here 0 is given the it will generate Arithmetic Exception, for this using try catch block
        try{
        	c=a/b;
        }catch(ArithmeticException e){System.out.println("denominator cant be zero"); c=-1;}
        System.out.println(a+" divided by "+b+" is "+c);
	}

}
