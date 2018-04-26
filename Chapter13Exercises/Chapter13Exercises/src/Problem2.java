/*
 * @author Joseph Schwenker
 * This program generates stars in a diamond pattern, like so:

   *
  * *
 * * *
* * * *
 * * *
  * *
   *

 */
public class Problem2 {

	static String stars(int index, int max) {
		// generate string
		String starsTemplate = "";
		String spacesTemplate = "";
		for (int i=0; i<max; i++) {
			starsTemplate += "* ";
			spacesTemplate += " ";
		}
		// end case
		if (index == max) {
			return spacesTemplate.substring(0, max-index+1) + starsTemplate.substring(0, index*2);
		}
		// general case
		else {
			return
				spacesTemplate.substring(0, max-index+1) + starsTemplate.substring(0, index*2) + "\n" + // leading spaces
				stars(index+1, max) + "\n" +
				spacesTemplate.substring(0, max-index+1) + starsTemplate.substring(0, index*2);
		}
	}
}
