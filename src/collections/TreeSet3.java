package collections;

import java.util.*;

public class TreeSet3 {

	/**
	 * @param args
	 */
	  static Set<String> list=new TreeSet<String>();
	static void display(){
		Iterator<String> itr=list.iterator();
	     while(itr.hasNext()){
	    	 System.out.println(itr.next());
	     }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   list.add("hello");
   list.add("these");
   list.add("are");
   list.add("list ");
   list.add("items");
    display();
     list.remove(2);
     System.out.println("after removing 2");
     display();
     list.clear();
     System.out.println("clearing complete memory");
     display();
	}

}
