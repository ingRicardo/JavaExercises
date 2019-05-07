/**
 * 
 */
package Practice;

/**
 * @author Ricardo Alfredo Macias Olvera
 *
 */
public class IntegerPalindrome {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 0;
		int lastd =0;
		int originalNumb =1001; 
		int nu = originalNumb;
		String str = String.valueOf(nu);
		int [] rev = new int[str.length()];
		do {
			lastd = (nu%10);
			nu = nu/10;
			rev[j] = lastd;
			j++;
			
		}while (nu !=0);
				
		int lastdd = 0;
		int nud = originalNumb;
		String result = "IT IS AN INTEGER PALINDROME";
		for (int k =rev.length-1 ; k >=0; k--) {
			lastdd = (nud%10);
			nud = nud/10;
			if ( rev[k] != lastdd)
				result = "IT IS NOT AN INTEGER PALINDROME";

		}
		System.out.println("\n"+originalNumb +" -->"+  result);
	}

}
