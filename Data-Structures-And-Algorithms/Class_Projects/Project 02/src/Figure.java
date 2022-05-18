/*
 * @author Jake Gearhart
 * @version 9/14/2021
 */
import java.awt.Color;

public abstract class Figure {
	
	protected boolean visible;
	protected Color color;
	protected BoundingBox bb1;
	
	/*
	 * Constructor
	 */
	public Figure() {
	}
	public Figure(Color color, boolean visible, BoundingBox bb1) {
		this.color = color;
		this.visible = visible;
		this.bb1 = bb1;
		//this.bb1 = new BoundingBox();
	}
	/*
	 * Area
	 */
	public abstract double area();
	
	public void setColor(Color c) {
		this.color = c;
	}
	/*
	 * Sets visibility to true
	 */
	public void makeVisible() {
		visible = true;
	}
	/*
	 * Sets visibility to false
	 */
	public void makeInVisible() {
		visible = false;
	}
	public void dilate(double factor) {
		System.out.println("BoundingBox value: " + bb1);
		//System.out.println("Dilate Worked!!!");
		//bb1 = bb2;
		//this.bb1 = new BoundingBox(bb1.p1, (bb1.getWidth() * factor), bb1.getHeight() * factor);
	}
	public void translate(double incX, double incY) {
		
		
	}
	
	/*
	 * Needs:
	 * dilate?
	 * translate
	 * larger
	 * equals
	 * and toString
	 */
	public String toString() {
		return "Color:" + color + " Visibile:" + visible + " BoundingBox:" + bb1;
	}
}
