/*
 * @author Joseph Schwenker
 * This program checks if the input string is a palindrome -- if it spells the same word both forwards and backwards.
 */
public class Problem6 {
	
	static Boolean isPalindrome(String string) {
		//System.out.println( "First letter: " + string.substring(0, 1) );
		//System.out.println( "Last Letter: " + string.substring(string.length()-1, string.length() ) );
		//end case
		if (string.length() == 1){
			return true;
		}
		// general case
		// check if the first and last letter are the same
		else if ( string.substring(0, 1).equals( string.substring(string.length()-1, string.length() ) ) ) {
			//System.out.println( "Next Palindrome: " + string.substring(1, string.length()-1) );
			// cut first and last letter off, check if this is a palindrome
			if ( isPalindrome( string.substring(1, string.length()-1) ) ) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}