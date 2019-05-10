/**
 * 
 */
package testing;

/**
 * @author Ricardo Alfredo Macias Olvera
 *	Reverse a String
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SODRACIR";
		
		String test ="",rev="";
		
		for (int i =1,j =0; i <= str.length() ; i++,j++) {
			
			test = str.substring(str.length()-i, str.length()-j);		
			rev=rev+test;
		}
			
		System.out.println(rev);	
	}

}
