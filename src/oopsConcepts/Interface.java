package oopsConcepts;
/**
 * 
 * The interface , itself, does not actually define any implementation.
 *  Although they are similar to abstract classes,
 * interfaces have an additional capability:
 *  A class can implement more than one interface. By contrast, a class
 *   can only inherit a single superclass (abstract or otherwise).

 */

public class Interface implements InterfaceCalc{

	
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	public void multi(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String aa[]){
		Interface o=new Interface();
		o.sum(20, 30);
		o.multi(20,30);
	}

}
