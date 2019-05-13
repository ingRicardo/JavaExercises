/**
 * 
 */
package testing;

/**
 * @author RICARDO ALFREDO MACIAS OLVERA
 *
 */
public class RepeatedChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDuplicates();
	}

	
	public static void printDuplicates() {
		String str = "duppliccatess";
		char test = '\0';
		int c=0;
		boolean flag =false;
		char [] cha = new char[str.length()];
		char [] fina = new char[str.length()];
		for (int i=0; i< str.length(); i++) {
			c =0;
			for (int j=0; j< str.length(); j++) {
				test = cha[i];
					cha[j] = str.charAt(j);
					if (test == cha[j]) {
						c++;
						if (c ==2 && fina[j]!=cha[j] && test == cha[j]) {
								fina[j] = cha[j];								
								flag = true;

						}
					}
			}
		}
		
		for (int i=0; i< fina.length; i++) {			
			if (fina[i] != '\0') {			
				System.out.println(fina[i]);
				
			}
		}
		if(!flag)
			System.out.println(flag);

	}
	
}
