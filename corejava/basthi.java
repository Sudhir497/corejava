package corejava;
import java.util.Scanner;
 class sanj {
	 int b;
void setbharath(int a, int d){
	b=a+d;
	System.out.println(b);
}
int getbharath(){
	
	return b;
}

}
public class basthi {

	public static void main(String[] args) {
		sanj nsanj=new sanj();
		Scanner nas=new Scanner(System.in);
		System.out.println("enter the values");
		int c=nas.nextInt();
		int e=nas.nextInt();
		nsanj.setbharath(c,e);
		int getBharathValue = nsanj.getbharath();
		System.out.println(getBharathValue);
		
	}

}
