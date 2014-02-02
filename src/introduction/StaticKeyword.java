package introduction;

public class StaticKeyword {

	/**
	 *  With static keyword we can call attributes & methods of a class without creating objects.
	 * static data members not duplicate for each object, act like a global
       variables.
     * static data members can access with class name, object & direct access.
        but non static members only access with object. 
     *  static can be class, variable, method & can be block also. 
     * any concept use with class name that is static.     Classname.methodName() - static method
	 */
	
	
	static class Inner{
		void disply(){
			System.out.println("i am in statc class,this is mainly used for creating inner class object without using outer class object");
		}
		
	}
	static int a=20;
	static void statDisp(){
		System.out.println("this is static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(a); //calling static variable
    Inner obj=new Inner();
    obj.disply(); //calling static class
      statDisp();// calling static method
    
	}

}
