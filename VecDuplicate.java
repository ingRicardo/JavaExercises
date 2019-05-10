/**
 * 
 */
package testing;

/**
 * @author Ricardo Alfredo Macias Olvera
 *	delete  duplicates in an integer array
 */
public class VecDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec = new int[] { 2, 7, 3, 5, 2, 3, 7 };
		System.out.println("--original--");
		for (int j = 0; j < vec.length; j++) {
			System.out.println(vec[j]);
		}
		
		for (int j = 0; j < vec.length; j++) {
			for (int i = 1; i < vec.length; i++) {
				if ((vec[j] == vec[i]) && (i != j)) {
					for (int k = 0; k < vec.length; k++) {
						if (i == k)
							vec[k] = 0;
					}
				}
			}
		}
		System.out.println("");
		int s = 0;
		for (int j = 0; j < vec.length; j++) {
			if (vec[j] != 0) {
				s++;
			}
		}
		int[] rep = new int[s];
		int r = 0;
		System.out.println("--res--");
		for (int j = 0; j < vec.length; j++) {
			if (vec[j] != 0) {
				rep[r] = vec[j];
				System.out.println(rep[r]);
				r++;
			}
		}

	}

}
