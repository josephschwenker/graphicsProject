/*
 * @author Joseph Schwenker
 * This program returns the input string backwards.
 */

public class Problem7 {
	
	static String backwards(String string) {
		// end case
		if (string.length() == 1) {
			//System.out.println(string);
			return string;
		}
		// general case
		else {
			//System.out.println(string);
			return 
				string.substring( string.length()-1, string.length() ) + // return last letter
				backwards( string.substring(0, string.length()-1) ); // slice last letter off, return last letter
		}
	}
}