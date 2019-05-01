/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class PyramidLeftRight {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =0; i < 10; i++) {
			
			for(int j = 0; j< i; j++) {
				
				System.out.print(j);
			}
			System.out.println("");
			
		}
		System.out.println("");
		for (int j=10; j>0; j--) {
			
			for (int i =0; i < j; i++)
				System.out.print(i);
			
			System.out.println("");
			
		}
		
		
	}

}
