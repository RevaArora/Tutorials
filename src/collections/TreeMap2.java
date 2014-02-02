package collections;

import java.util.*;

public class TreeMap2 {

	/** treemap is ordered hashmap
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,String> map1=new TreeMap<Integer,String>();
     map1.put(101,"this");
     map1.put(103,"is");
     map1.put(102,"TreeMap");
     System.out.println(map1);
     Set set=map1.entrySet();
     Iterator itr=set.iterator();
    		 while(itr.hasNext()){
    			Map.Entry g=(Map.Entry) itr.next();
    	 System.out.println(g.getKey()+" "+g.getValue());
     }	
     
	}

}
