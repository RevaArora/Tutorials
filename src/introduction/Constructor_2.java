package introduction;


//user define Constructor with Constructor overloading example
class Constructor_2
{
	/**
	 * @param args
	 */
int a,b;
Constructor_2() // no argument passing Constructor
{
  a = b = 0;
}
Constructor_2(int x) // one argument passing Constructor
{
  a = b = x;
}
Constructor_2(int x,int y) // two argument passing Constructor
{
  a = x;
  b = y;
}
void disp()
{
  System.out.printf("a = %d, b = %d\n",a,b);
}
public static void main(String aa[])
{
   Constructor_2 o1 = new Constructor_2(); // no argument passing Constructor calling
   Constructor_2 o2 = new Constructor_2(100); // one argument passing Constructor calling
   Constructor_2 o3 = new Constructor_2(10,20); // one argument passing Constructor calling
   o1.disp(); // a = 0 , b = 0
   o2.disp(); // a = 100 , b = 100
   o3.disp(); // a = 10 , b = 20
}
}
