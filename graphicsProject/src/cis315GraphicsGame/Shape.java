/**
 *   file: Shape.java
 */
package cis315GraphicsGame;

import java.awt.Color;
import java.awt.Point;
import java.awt.color.ColorSpace;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class Shape {
	// this is the parent class to all Shapes
	
	Point pntUL = new Point();  // defines bounding box, upper-left
	Point pntLR = new Point();  // defines bounding box, lower-right
	Color colorOutline = new Color( Color.black.getRGB() );
	Color colorFill = new Color( Color.WHITE.getRGB() );
	boolean isSolidFill = false;
	Color colorText = new Color( Color.GRAY.getRGB() );
	boolean isSolidLine = true;
	
	
	// getters and setters 
	
	void setColors( Color cOutline, Color cFill ) {
		this.colorOutline = cOutline;
		this.colorFill = cFill;
	}
	
	void setSolidFill( boolean bSolid ) {
		isSolidFill = bSolid;
	}
	
	boolean getSolidFill() {
		return isSolidFill;
	}
	
	Point UR() { // returns point at upper right
		return new Point( (int) pntLR.getX(), (int) pntUL.getY()); // need to typecast to int because the constructor can only take ints
	}
	
	Point LL() { // returns point at lower left
		return new Point( (int) pntUL.getX(), (int) pntLR.getY());
	}
	
	
	
}
