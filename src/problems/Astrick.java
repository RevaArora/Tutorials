package problems;

public class Astrick {

	/** In this we will look into the basic looping problem ie, to draw an astrick tree
	 * something like this
	 * #
	 * ##
	 * ###
	 * ####
	 * #####
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.printf("#");
			}
			System.out.println();
		}

	}

}
