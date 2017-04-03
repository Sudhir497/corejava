package arrays;

public class Arraytest1 {
public static void main(String ags[]){
	int array[]={11,22,33,44,55,66,77,88,99,111};
	System.out.printf("%s%8s\n","Index","Value");
	for(int counter=0;counter<array.length;counter++)
		System.out.printf("%5d%8d\n",counter,array[counter]);
	
}
}
