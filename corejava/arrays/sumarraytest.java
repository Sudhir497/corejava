package arrays;

public class sumarraytest {

	public static void main(String[] args) {
		int array[]={1,5,3,4,6,2,7,9,8,10};
		System.out.printf("%s%8s\n","Index","Value");
		int total=0;
		for(int counter=0;counter<array.length;counter++){
			total +=array[counter];
			System.out.printf("%5d%8d\n",counter,array[counter]);
		}
		System.out.printf("Total of array elements is %d\n",total);
		
		

	}

}
