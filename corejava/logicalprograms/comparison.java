package logicalprograms;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("enter first interger");
		a=input.nextInt();
		System.out.println("enter second interger");
		b=input.nextInt();
		if (a==b)
			System.out.printf("%d==%d",a,b);
		if(a>b)
			System.out.printf("%d>%d",a,b);
		if(a<b)
			System.out.printf("%d<%d",a,b);

	}

}
