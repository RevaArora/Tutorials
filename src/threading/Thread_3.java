package threading;
/*
 * -> we can also give names to threads by methods setName(), 
 *    and use it by getName().
 * -> we may also set priority by setPriority() method,and get the
 *    priority by getPriority()
 *  -> also we may set a thread as daemon thread.Daemon thread is 
 *  service provider thread , it provides services to user Thread.
 *  Note: set a thread as Daemon before starting it
 *  
 */
public class Thread_3 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i+"  "+Thread.currentThread().getName());
		}
	}
	public static void main(String aa[]){
		
		Thread_3 ob=new Thread_3();
		Thread_3 ob1=new Thread_3();
		Thread_3 ob2=new Thread_3();
		ob.setDaemon(true);
		ob.setName("number one");
		ob1.setName("number two"); // ob1.setPriority(MAX_PRIORITY);
		ob2.setName("number three");
		ob.start();
		ob1.start();
		ob2.start();
	}

}
