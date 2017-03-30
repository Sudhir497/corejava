package loops;

public class Continue {

	public static void main(String[] args) {
		for(int a=1 ;a<=20;++a)
		{
			if (a==10)
				continue;
			System.out.printf(" %d ",a);
		}
		System.out.println("\n used continue to skip printing 10");

	}

}
