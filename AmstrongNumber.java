/**
 * 
 */
package Practice;

/**
 * @author Ricardo Alfredo Macias Olvera
 *
 */
public class AmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumb;
		int numb;
		int last;
		for (int j = 0; j < 1000; j++) {
			originalNumb = j;
			numb = j;
			last = 0;
			int sum = 0;
			do {
				last = numb % 10;
				numb = numb / 10;
				sum = (int) (sum + Math.pow(last, 3));

			} while (numb != 0);

			if (sum == originalNumb)
				System.out.println(originalNumb + " is an Amstrong number");

		}
	}

}
