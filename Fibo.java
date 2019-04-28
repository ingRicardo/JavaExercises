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
			for (int i = 0 ; i < vec.length; i++) {
				
				if (i<2) {
					vec[i] = i;
					
				}else if( i==2) {
					vec[i] = i-1;
					
				}else if (i > 2){
					vec[i] = vec[i-1] + vec[i-2];
					
				}
				
				System.out.println(vec[i]);
				
					
			}
			
			
			System.out.println("------Using-Recursivity------");
			int val = 15;
			int [] v =  new int[val];
			int x =0;
			recur(0,x,v, val);
			
			
	}
	
	
	public static void recur(int n, int x, int [] v, int val) {
			
		if (n ==0 ) {
			x = 0;
			v[n] = x;
		}else if(n ==1) {
			x=1;
			v[n] = x;
		}else if(n < val){
			v[n] = v[n-1]  + v[n-2]; 
		}
		
		if (n < val) {
			System.out.println( v[n]);
			recur(n+1,x,v, val);
			
		}
		
	}
		
	
	
}
