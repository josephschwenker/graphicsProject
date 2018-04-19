package cis315GraphicsGame;

public class Rectangle extends Shape {
	
	Rectangle(int x, int y, int width, int height) { // Constructor
		this.pntUL.setLocation(x, y);
		this.pntLR.setLocation(x+width, y+height);
	} // end constructor

}