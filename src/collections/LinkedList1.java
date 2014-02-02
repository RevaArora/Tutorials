package collections;

import java.util.*;

public class LinkedList1  {

	/**
	 * @param args
	 */
	static List<String> list=new LinkedList<String>();
	static void display(){
		Iterator<String> itr=list.iterator();
	     while(itr.hasNext()){
	    	 System.out.println(itr.next());
	     }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  list.add("this");
	  list.add("is");
	  list.add("linked list");
     display();
     System.out.println("adding elements at index 1");
     list.add(1,"index 2");
     display();
     System.out.println("remving elements at index 2");
     list.remove(2);
     display();
	}

}
