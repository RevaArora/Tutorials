package threading;

public class Thread_4 {

	/**
	 * requesting garbage collector
	 * for this we have 2 methods -> gc() it is in runtime class
	 * whenever gc is invoked,it calls the method finalize
	 */
	protected void finalize(){ System.out.println("garbage Collected");//here we tell finalize method to print 
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread_4 ai=new Thread_4();
       ai=null;
       Thread_4 a2=new Thread_4();
       a2=null;
       System.gc();// calling garbage collector methodwhichin turn calles finalize method
	}

}
