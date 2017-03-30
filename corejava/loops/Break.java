package loops;

public class Break {

	public static void main(String[] args) {
		int a;
		for( a=1 ;a<=20;++a)
		{
			if (a==10)
				break;
			System.out.printf(" %d ",a);
		}
		System.out.printf("\n Broke out of loop at a =%d",a);
	}

}
