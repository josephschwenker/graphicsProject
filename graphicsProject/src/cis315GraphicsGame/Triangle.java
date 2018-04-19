package cis315GraphicsGame;

public class Triangle extends Shape {
	
	Triangle(int x, int y, int width, int height) { // Constructor
		this.pntUL.setLocation(x, y);
		this.pntLR.setLocation(x+width, y+height);
	} // end constructor

}
