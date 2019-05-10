/**
 * 
 */
package testing;

/**
 * @author Ricardo Alfredo Macias Olvera
 *
 */
public class Factorial_rec {

	/**
	 * @param args
	 */
	public static int re=1,num =8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fac(num);	
		System.out.println("re-> "+ re);
	}
	
	public static int fac(int n) {
		if (n==0)
			return 0;
		if ((n-1)>0) {
			re = num*(n-1);
			num = re;
		}		
		return fac(n-1);			
	}

}
