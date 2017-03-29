package logicalprograms;

import java.util.Scanner;

public class objectdec1 {
	public void sudhir(String name){
		System.out.printf("hello %s!!\n",name);
	}
	
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	objectdec1 xyz = new objectdec1();
	System.out.println("enter the name ");
	String abc = input.nextLine();
	System.out.println();
	xyz.sudhir(abc);
	
	
	
}
}
