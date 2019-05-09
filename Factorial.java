/**
 * 
 */
package testing;

/**
 * @author Ricardo Alfredo Macias Olvera
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n =7;
			int res=0;
						
			for (int i=n; i>0; i--) {
				if (i==n)
					res = i*(i-1);
				else if (i<(n-1))	
					res = res*i;
			}
			System.out.println("\n"+res);			
	}

}
