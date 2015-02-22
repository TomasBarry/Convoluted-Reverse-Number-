

public class ReverseNumber {
	/**
	 * reverse
	 * recursively find the reverse of the passed number by calling reverseN
	 * 
	 * @param n: number to reverse
	 * @return: the reverse of n
	 */
	public static long reverse(long n) {
		return reverseN(n, 0);
	}

	/**
	 * reverseN
	 * recursively find the reverse of a number without using
	 * division, modulus or multiplication
	 * 
	 * Restrictions imposed;
	 * 			 Multiplication ('*'), division ('/') and 
	 * 			 modulus ('%') are not allowed
	 * 			 No number apart from 1 is allowed
	 * 			 Allowed operations are;
	 * 				-Addition ('+')
	 * 				-Subtraction ('-')
	 * 				-Logical shifting ('<<' and '>>')
	 * 				-Ternary operations
	 * 					->Including comparison ('<' and '!=')
	 * 
	 * Quick reference;
	 * 			 0 = (1 >> 1)
	 *		     2 = (1 << 1)
	 *			 3 = ((1 << 1) + 1)
	 *			 4 = ((1 << 1) << 1)
	 *			 8 = (((1 << 1) << 1) << 1)
	 *			 9 = ((((1 << 1) << 1) << 1) + 1)
	 *			10 = ((((1 << 1) << 1) << 1) + (1 << 1))
	 *			16 = ((((1 << 1) << 1) << 1) << 1)
	 *
	 * @param n: number to reverse
	 * @param reversedNumber: the current state of the reverse
	 * @return: reverse of the number
	 */
	private static long reverseN(long n, long reversedNumber) {
		return n != (1 >> 1) 
			? reversedNumber = reverseN(
				/////////////////////////////////////////*  start divide n by 10           *//////////////////////////////////////
				((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n >> 1)
				+ (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1)))  >> ((1 << 1) << 1))) >> (((1 << 1) << 1) << 1))
				) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n >>
				1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >> (((1 << 1) << 1) << 1
				))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) 
				/////////////////////////////* add 0 or 1 to the above based   				*/////////////////////////////////////
				/////////////////////////////* on whether or not the following 				*/////////////////////////////////////
				/////////////////////////////* calculation is greater than 9  				*/////////////////////////////////////
				+ (((n - (((((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) <<
				1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
				(((1 <<1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
				((1 <<1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1
				) <<1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) <<
				(1 << 1)) + ((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 
				1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
				(((1 << 1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
				((1 << 1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1)
				<< 1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1))) << 
				1)) 																		// end calculation
				> ((((1 << 1) << 1) << 1) + 1))												// compare to 9
				? 1 																		// add one if greater than 9
				: (1 >> 1))																	// add 0   if less 	  than 9
				//////////////////////////////////////////*  end divide n by 10             */////////////////////////////////////
				,
				//////////////////////////////////////* start append  to reverseNumber      */////////////////////////////////////
				//////////////////////////////////////* append(r) = (10*r) + modulus(n)     */////////////////////////////////////
				//////////////////////////////////////* start by getting 10*r               */////////////////////////////////////
				(((reversedNumber << ((1 << 1) + 1)) + (reversedNumber << 1)))  	    	// 10*r
				//////////////////////////////////////* then need to add the modulus   		*/////////////////////////////////////
				//////////////////////////////////////* modulus(n) = n - 10*(n/10)       	*/////////////////////////////////////
				//////////////////////////////////////* start by getting setting up n -		*/////////////////////////////////////
				+ (n - 																		// n -
				//////////////////////////////////////*  start divide n by 10  				*/////////////////////////////////////
				((((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n
				>> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1)))  >> ((1 << 1) << 1))) >> (((1 << 1) << 1) <<
				1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n >>
				1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >> (((1 << 1) << 1) << 1)))
				>> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) 
					/////////////////////////////* add 0 or 1 to the above based    		*/////////////////////////////////////
					/////////////////////////////* on whether or not the following  		*/////////////////////////////////////
					/////////////////////////////* calculation is greater than 9    		*/////////////////////////////////////
					+ (((n - (((((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) <<
					1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
					(((1 <<1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
					((1 <<1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1
					) <<1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) <<
					(1 << 1)) + ((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 
					1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
					(((1 << 1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
					((1 << 1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1)
					<< 1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1))) << 
					1)) 																	// end calculation
					> ((((1 << 1) << 1) << 1) + 1))											// compare to 9
					? 1 																	// add one if greater than 9
					: (1 >> 1))																// add 0   if less 	  than 9		
																							// (n/10)
				/////////////////////////////////*  end divide n by 10          			*/////////////////////////////////////
				/////////////////////////////////* then multiply by 8           			*/////////////////////////////////////
				<< ((1 << 1) + 1)) 															// multiply by 8
				/////////////////////////////////*  now have 8*(n/10)           			*/////////////////////////////////////
				/////////////////////////////////*  now need 2*(n/10)           			*/////////////////////////////////////
				+ 																			// add both 8 * (n/10) and 2 * (n/10)
				//////////////////////////////////////*  start divide n by 10  				*/////////////////////////////////////
				((((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n
				>> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1)))  >> ((1 << 1) << 1))) >> (((1 << 1) << 1) <<
				1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) + ((((n >>
				1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >> (((1 << 1) << 1) << 1)))
				>> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) 
					/////////////////////////////* add 0 or 1 to the above based   			*/////////////////////////////////////
					/////////////////////////////* on whether or not the following 			*/////////////////////////////////////
					/////////////////////////////* calculation is greater than 9   			*/////////////////////////////////////
					+ (((n - (((((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) <<
					1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
					(((1 <<1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
					((1 <<1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1
					) <<1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1)) <<
					(1 << 1)) + ((((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 
					1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1) << 1))) >>
					(((1 << 1) << 1) << 1))) + (((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >>
					((1 << 1) << 1))) + ((((n >> 1) + (n >> (1 << 1))) + (((n >> 1) + (n >> (1 << 1))) >> ((1 << 1)
					<< 1))) >> (((1 << 1) << 1) << 1))) >> ((((1 << 1) << 1) << 1) << 1))) >> ((1 << 1) + 1))) << 
					1)) 																	// end calculation
					> ((((1 << 1) << 1) << 1) + 1))											// compare to 9
					? 1 																	// add one if greater than 9
					: (1 >> 1)))															// add 0   if less 	  than 9
																							// (n/10)
					/////////////////////////////*  end divide n by 10              		*////////////////////////////////////
				/////////////////////////////////* then multiply by 2           			*////////////////////////////////////
				<< 1))) 																	// multiply by 2
			) 																				// end of passing parameters
       : reversedNumber;																	// returned if n == 0
	}
	
	/**
	 * main for testing
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Don't do this");
		long correctReverse, resultingReverse;
		for (long i = 0; i < Integer.MAX_VALUE/100; i++) {
			// Long.parseLong is to account for leading 0s
			correctReverse = Long.parseLong(new StringBuilder("" + i).reverse().toString());
			resultingReverse = ReverseNumber.reverse(i);
			// test that numbers are correct
			if(correctReverse != resultingReverse) {
				throw new Exception();
			}
		}
		System.out.println("Seriously, don't");
	}
}