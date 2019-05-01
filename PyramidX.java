/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class PyramidX {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int k = 0;
		do {
			
			for(int j =0; j<i ; j++) {
				if(j == 9 )
					System.out.print(i);
				else
					System.out.print(" ");
			}
			
			for(int j =0; j<k ; j++) {
				System.out.print(j);
			}
			
			for(int j =0; j<k ; j++) {
				System.out.print(j);
			}
			
			
				System.out.println("");
			
			i--;
			k++;
		
		}while(i>=0);
	}

}
