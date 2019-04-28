/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class Fibo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			System.out.println("-------->>");
			
			int [] vec =  new int[15];
			for (int i = 0 ; i < 15; i++) {
				
				if (i<2) {
					vec[i] = i;
					
				}else if( i==2) {
					vec[i] = i-1;
					
				}else if (i > 2){
					vec[i] = vec[i-1] + vec[i-2];
					
				}
				
				System.out.println(vec[i]);
				
					
			}
			
			
	}
	
}
