package problems;

public class Anagram {

	/**Anagram is is a word or phrase 
	 * formed by changing the order of letters in another word or phase.
	 * this program checks is the word "child" is anagram of its "parent"
	 */

	public boolean isAnagram(String par,String chil){
      //declaring and initializing arrays
		int i;
		int parent[]=new int[27];
	    int child[]=new int[27];
		
		for( i=0;i<par.length();i++){
			parent[(par.charAt(i)-97)]++;
		}
		for( i=0;i<chil.length();i++){
			child[(chil.charAt(i)-97)]++;
		}
		i=0;
		while(i<27){
			if(parent[i]>=child[i])
				i++;
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram obj=new Anagram();
      String parent ="triangle";
      String child ="inte";
     // for estimating time-- long t=System.nanoTime();
      System.out.println((obj.isAnagram(parent,child)));	
     // for estimating time- System.out.println(System.nanoTime()-t);
   }
}
