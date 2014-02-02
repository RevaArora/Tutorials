package oopsConcepts;
   /**
    * implementation of Abstract class
    * Abstract classes not is use, because using classes java support
      only single inheritance, then one class can extends only with
       one Abstract class or one Concrete class. 
    */
abstract class Calc {
	void sum(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	abstract void sub(int a,int b);
}


