package loops;

public class Interesttest {

	public static void main(String[] args) {
		 double a;
	      double p = 10000.0;
	      double r = 0.05;
	      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );
	      for ( int year = 1; year <= 10; year++ )
	      {
	    	  a = p * Math.pow( 1.0 + r, year );
	    	  System.out.printf( "%4d%,20.2f\n", year, a );
	      }

	}

}
