/**
 * 
 */
package testing;

/**
 * @author TIJUANA
 *
 */

class PrintProduceConsumeData {
	   public void printCount(String threadName,StringBuffer str, int data) {
	      try {

	          if ("Thread-1".equals(threadName))
	    	  	str.append(String.valueOf(data));
	          else {
	        	  System.out.println("length -> "+ str.length());
	        	  if (str.length() > 0)
	        		  str = new StringBuffer();
	          
	          }
	             System.out.println(" str -> "+ str);
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}



class Thread_three extends Thread{
	
	private Thread t;
	private String threadName;
	PrintProduceConsumeData PC;
	StringBuffer STR;   
	int DATA;
	   Thread_three( String name,PrintProduceConsumeData  pc, StringBuffer str, int data) {
	      threadName = name;
	      PC =pc;
	      STR =str;
	      DATA =data;
	      System.out.println("Creating " +  threadName );
	   }
	
	   public void run() {
		      System.out.println("Running " +  threadName );
			   synchronized(PC) {
			         PC.printCount(threadName,STR,DATA);
			      }
		      System.out.println("Thread " +  threadName + " exiting.");
		   }
	   
	   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
	
}

public class Process {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		int data = 1;
		PrintProduceConsumeData PC =new PrintProduceConsumeData();
		Thread_three T1 = new Thread_three( "Thread-1",PC,str,data);
	      T1.start();
	      
	      Thread_three T2 = new Thread_three( "Thread-2",PC,str,data);
	      T2.start();
	}

}
