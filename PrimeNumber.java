/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class PrimeNumber {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p =0;
		for (int i =0; i <1001; i++ ) {
			p = 0;
				for (int j =1; j<= i; j++) {
					if (i%j == 0) {
						p++;
					}
		}
			if (p == 2)
				System.out.println(i);

			
		}
	}

}
