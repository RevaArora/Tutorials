package threading;

public class Thread_1 extends Thread {

 	/** there are mainly two methods to implement thread,
 	 *  one by creating a thread object (inheritance) other by implementing runnable interface
 	 *  (interface)
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is the implementation of thread using extends ie, inheratance." +
				" The note of advice ,write each code yourself to learn, " +
				" Happy learning, Reva ";
         for(int i=0;i<str.length();i++){
        	 System.out.print(str.charAt(i));
        	 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
         }
	}

}
