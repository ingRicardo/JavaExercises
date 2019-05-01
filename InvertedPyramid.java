/**
 * 
 */
package Javas;

/**
 * @author Ricardo Alfredo
 *
 */
public class InvertedPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		do{
		
			for (int k=0; k<i; k++)
				System.out.print(" ");
			
			
			for(int j =10; j> i; j--) {
				
					System.out.print(" "+i);
			}
			
			for (int k=0; k<i; k++)
				System.out.print(" ");
			
			System.out.println("");
		
		i++;
	}while(i< 10);
	}
}
