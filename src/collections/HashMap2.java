package collections;

import java.util.*;

public class HashMap2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")// this is used here to suppress warnings about the generic types
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,String> map1=new HashMap<Integer,String>();
     map1.put(101,"this");
     map1.put(103,"is");
     map1.put(102,"hashMap");
     System.out.println(map1);
   
	Set set=map1.entrySet();
     
	Iterator itr=set.iterator();
    		 while(itr.hasNext()){
    			Map.Entry g=(Map.Entry) itr.next();
    	 System.out.println(g.getKey()+" "+g.getValue());
     }	
     
	}

}
