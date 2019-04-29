/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class Pyramid {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do {
			
			for (int j =0; j< 5-i; j++)
				System.out.print(" ");
				
			for (int j =0; j<= i; j++)
				System.out.print(i);
			
			for (int j =0; j<= i; j++)
				System.out.print(i);
			
			System.out.println(" ");
			i++;
		}while(i< 5);
	}

}
