package ExceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep_2 {

	/**
	 * finally keyword
	 * it it used to define after try and catch now what is to be done finally
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
	       Scanner in=new Scanner(System.in);
	        System.out.println("enter two numbers to be divided");
	        try{
	        	a=in.nextInt();
	        }catch(InputMismatchException e){a=0; in.next();}
	        
	        try{
	        	b=in.nextInt(); //if here 0 is given the it will generate Arithmetic Exception, for this using try catch block
	        }catch(InputMismatchException e){b=0;}
	        try{
	        	c=a/b;
	        }catch(ArithmeticException e){System.out.println("denominator cant be zero");}
	       System.out.println(a+" divided by "+b+" is "+c);
		}

}
