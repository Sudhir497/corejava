package arrays;

import java.util.Random;

public class rolladie {

	public static void main(String[] args) {
		Random die = new Random(); // random number generator
	      int number[] = new int[ 7 ]; // array of frequency counters

	      // roll die 6000 times; use die value as frequency index
	      for ( int roll = 0; roll <= 6; roll++ ) 
	         ++number[ 1+die.nextInt( 6 ) ];  

	      System.out.printf( "%s%10s\n", "Face", "Frequency" );
	   
	      // output each array element's value
	      for ( int face =1; face < number.length; face++ )
	         System.out.printf( "%4d%10d\n", face, number[ face ] );

	}

}
