package introduction;

public class ThisKeyword {

	/** This is always reference to the object on which method was invoked
	 * 
	 */
	static int p,q;
   ThisKeyword(){
	   p=0;q=0;
   }
   ThisKeyword(int x){
	   this(x,100);
   }
   ThisKeyword(int x,int y){
	   p=x;q=y;
   }
	  int a = 1000;
	  void disp()
	  {
	    int a = 100;
	    System.out.printf("a = %d \n",a); // local a 
	    System.out.printf("a = %d \n",this.a); // currentobject.a - global of current class
	  }
	  @SuppressWarnings("unused")
	public static void main(String aa[])
	  {
	    ThisKeyword o = new ThisKeyword();
	    o.disp();
	    //for constructor example
	    ThisKeyword o1=new ThisKeyword();
	    System.out.println("value of p="+p+"and q="+q);
	    ThisKeyword o2=new ThisKeyword(50);
	    System.out.println("value of p="+p+"and q="+q);
	    ThisKeyword o3=new ThisKeyword(200,300);
	    System.out.println("value of p="+p+"and q="+q);
	  }
	}