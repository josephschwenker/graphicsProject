/*
 * @author Joseph Schwenker
 * This program takes an integer x to an integer power y.
 */
public class Problem9 {
	static double power(int x, int y) {
		if (y<0) { // base case
			return 1/( power(x, -y) );
		}
		else if (y==0) { // end case
			return 1;
		}
		else if (y==1) { // end case
			return x;
		}
		else { // y > 1, base case
			return x*power(x, y-1);
		}
	}
}