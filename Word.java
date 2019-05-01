/**
 * 
 */
package javas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author alfredo
 *
 */
public class Word {


	/**
	 * @param args
	 * @throws IOException 
	 */
	 
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/alfredo/stsProjects/JavaExersices/src/javas/textFile.txt"); 
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st; 		  
		  String [] vec = new String[5];
		  int i=0;

		  while ((st = br.readLine()) != null) {
			  vec[i] = st;
			  System.out.println(vec[i]);
			  i++;  
		  }
		     
		  System.out.println("-----");
		  int cont = 0;
		  int [] contVec = new int[vec.length];  
		  for (i =0; i< vec.length; i++) {
			
			  if((i+1) < vec.length) {
		
			  String[] str = vec[i].split(" ");
			  String[] strNext = vec[i+1].split(" ");
			  cont = 0;
			for (int k = 0; k < str.length; k++) {
				for (int j=0; j<str.length; j++) {
					if (str[k].equals(strNext[j])) {
						cont++;
					}
					
			  	}
			
			  }
			contVec[i] = cont;
			  } 
		  }
		  
		  int max =0;
		  int xx = 0;
		  for (int x = 0; x< contVec.length; x++) {			  
			  int tmps = contVec[x];
			  for (int w = 0; w < contVec.length; w++) {
				   xx = contVec[w];
				  if (tmps > xx) {  
					  max = tmps;
				  }  
			  }
			 }
 		  
		  System.out.println(vec[max]);
		  }	
}
