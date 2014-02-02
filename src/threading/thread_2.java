package threading;
//the join method, the join method waits for a thread to die, ie, 
//it causes currently running threads to stop until the thread which 
//joins die , or for predefined time.

public class thread_2 extends Thread{
	public void run(){
		for (int i=0;i<5;i++){
		System.out.println(i);
		}
	}
	
 public static void main(String aa[]){
	 thread_2 ob=new thread_2();
	 thread_2 ob1=new thread_2();
	 thread_2 ob2=new thread_2();
	 ob.start();
	 try{
		 ob.join(); //here if we mention the value in integer we specify the time untill which the other threads should wait
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 ob1.start();
	 ob2.start();
 }
}
