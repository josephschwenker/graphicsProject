/*
 * @author Joseph Schwenker
 * This program generates stars in the following pattern:

    ****
    ***
	**
	*
	*
	**
	***
	****

 */

public class Problem1 {
	
	static String stars(int n) {
		// generate string
		String template = "";
		for (int i=0; i<n; i++) {
			template += "*";
		}
		// end case
		if (n==1) {
			return "*\n*";
		}
		// general case
		else {
			return
				template.substring(0, n) + "\n" +
				stars(n-1) + "\n" +
				template.substring(0, n);
		}
	}
}