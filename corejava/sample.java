/**
 * 
 */
package corejava;

/**
 * @author Admin
 *
 */
public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to java club");

		mymethod();
	    int x=100;
		boolean mymethod1Value = false;
		
		System.out.println("mymethod1Value during initialization "+mymethod1Value+x); 
		
		mymethod1Value = mymethod1();
		
		System.out.println("mymethod1Value is "+mymethod1Value);
		
		
	}

	public static void mymethod(){
		System.out.println("Mymethod in sample class");
	}
	
	public static boolean mymethod1(){
		System.out.println("Mymethod in sample class");
		return true;
	}
}
