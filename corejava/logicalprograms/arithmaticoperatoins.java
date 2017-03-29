package logicalprograms;

import java.util.Scanner;

public class arithmaticoperatoins {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a ,b , c ;
		int result ;
		System.out.println("enter first interger");
		a= input.nextInt();
		System.out.println("enter second interger");
		b= input.nextInt();
		System.out.println("enter thrid interger");
		c= input.nextInt();
		result= a*b*c;
		System.out.println("product is"+result);

	}

}
