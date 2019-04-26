/**
 * 
 */
package Java;

/**
 * @author TIJUANA
 *
 */
public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "civic", rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev =  rev +	str.charAt(i);
			
		}
		if (str.equals(rev))
			System.out.println(str + " is Palindrome ");
		else 
			System.out.println(str + " is not Palindrome ");
		
	}

}
