/*
 * @author Jacob Gearhart
 */

    public interface LargeInteger<T> extends Comparable<T> {
	/*
	 * Adds the two LargeIntegers
	 * @param input 
	 */
	LargeInteger<T> add(LargeInteger<T> input);
	
	/*
	 * Subtracts the two LargeIntegers
	 */
	LargeInteger<T> subtract(LargeInteger<T> input);
	
	/*
	 * Will make LargeInteger negative
	 */
	LargeInteger<T> negate();
	
	/*
	 * Returns absolute value
	 */
	LargeInteger<T> abs();
	
	/*
	 * Returns larger LargeInteger
	 */
	LargeInteger<T> max(LargeInteger<T> input);
	
	/*
	 *Returns the smaller LargeInteger 
	 */
	LargeInteger<T> min(LargeInteger<T> input);
	
	/*
	 * Returns 0 if = 0, 1 if positive, -1 if negative
	 */
	int signum();

}
