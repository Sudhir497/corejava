package logicalprograms;

import java.util.Scanner;

public class setgetmethod {
	private String thename;
	public  void setname(String name){
		thename =name;
	}
		public String getname(){
			return thename ;
		}
		public void abc (){
			System.out.printf("Holla %s!\n",getname());
		}
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			setgetmethod xyz = new setgetmethod();
			System.out.printf("Intial value is %s\n",xyz.getname());
			System.out.println("enter the name");
			String aaa = input.nextLine();
			xyz.setname(aaa);
			System.out.println();
			xyz.abc();
		      
			
		}
	
}
