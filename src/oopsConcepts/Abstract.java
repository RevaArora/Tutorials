package oopsConcepts;

public class Abstract extends Calc {

	/**Abstract class - if one class has one or more abstract method then 
    that is called abstract class. we can't create instance of an abstract
    class, that is only for inherit purpose. use for create/design the
    Generic Methods. 
	 */
	void sub(int a,int b){
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Abstract o=new Abstract();
     o.sum(50, 20);
     o.sub(50, 20);
	}


}
