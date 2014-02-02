package introduction;

public class Constructrs {

	/**
	 * constructors are the methods with the same name as the class , 
	 * they are used to initialize the class objects.
	 * when a single class is having more than one constructor , 
	 * it is called overriding. 
	 * @param args
	 */
	Constructrs(){
		System.out.println("this is constructor with no parameter");
	}
	Constructrs(int a){
		System.out.println("this consructor has been initialized with value "+a);
	}
	Constructrs(String name,int a){
		System.out.println("String is "+name+" and integer is "+a);		
	}
	void display(){
		System.out.println("Method call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructrs a=new Constructrs();
		Constructrs b=new Constructrs(25);
		Constructrs c=new Constructrs("Reva",22);
		a.display();
		b.display();
		c.display();
	}

}
