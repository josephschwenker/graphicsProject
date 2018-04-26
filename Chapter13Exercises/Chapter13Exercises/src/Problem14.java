/*
 * @author Joseph Schwenker
 * This program converts a number in base 10 to a number (String) in any base from 2 to 36.
 */

public class Problem14 {
	static String convertToBase(int decimal, int base) {
		// numbers past 9
		String numbers = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// end case
		if (decimal==0) {
			return "";
		}
		// general case
		else {
			return convertToBase( (int) (decimal/base), base ) + numbers.substring(decimal%base, decimal%base+1);
		}
	}
}