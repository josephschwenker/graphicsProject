package cis315GraphicsGame;

public class RoundedRectangle extends Shape {
	
	// border radius
	static int arcWidth = 20;
	static int arcHeight = 20;
	
	RoundedRectangle(int x, int y, int width, int height) { // Constructor
		this.pntUL.setLocation(x, y);
		this.pntLR.setLocation(x+width, y+height);
	} // end constructor
	
}