package introduction;
class Final{
	final void display(){
		System.out.println("this is display methodin child class");
	}
}

final class CannnotBeExtended{
	 void display(){
		System.out.println("this is display method in child class");
	}
}
 
 
public class Final_eg extends Final{

	/**final - keyword, final that means final - fixed - can't changed, 
           like constant in C & C++. 
     *  final can be variable, object, method & can be class also. 
     * if variable is final then can't reassign any value. 
     * if method is final can't override in child class. 
     * if class is final then can't extends. 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=20; //this value cannot be changed
		System.out.println(a);
		 
		CannnotBeExtended obj=new CannnotBeExtended();	
		obj.display();

	}
	/*  this method will create error as display method is
	 *  defined as final in paren5t class
	    void display(){
		   System.out.println("hello");
	    }
    */
}
