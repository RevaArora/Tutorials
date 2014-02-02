package introduction;

public class InnerClass {

	/**
   * inner/nested class - class inside class, mainly used in event 
       handling & multiThreading. 

   * inner class can access the outer class members, but outer class
      can't access the inner class members, like local & global variables
      in C & C++. 

   *  inner class can be private, protected, final, public, abstract &
      can be static also.but outer class can't be static, private & can't be protected
   *  if inner class is static then we can  create inner class object in outer class p s v m,
      without using outer class object - direct
  Adv - by using inner classes we can implement the concept of multiple 
       inheritance.
	 */
	
	class Inner_1{
		void display(){
			System.out.println("i am now in inner class method");
		}
	}
	static class Inner_2{
		void display(){
			System.out.println("i am now in static inner class method");
		}
	}
	void outerclassmethod(){
		System.out.println("i am  outer class method");
	}
	void called(){
		Inner_1 obj =new Inner_1();
		obj.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //**   Inner_1 obj1= new Inner_1(); ** //inner class object cant be instantiated here
	    InnerClass obj=new InnerClass();
	    obj.outerclassmethod(); //to call outer class method
	    obj.called(); // to call inner class method
	    //or we may do it directly without using called method by this
	    Inner_1 mission= obj.new Inner_1();
	    mission.display();
	    // static inner class-creating inner class object without using uter calss object
	     Inner_2 stat=new Inner_2();
	     stat.display();
	    
	}

}
