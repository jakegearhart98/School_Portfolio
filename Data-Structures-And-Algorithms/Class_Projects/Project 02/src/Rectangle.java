/*
 * @author Jake Gearhart
 * @version 9/14/2021
 */
import java.awt.Color;

	class Rectangle extends Figure{
	
	private double width, height, x, y;
	private Color c;
	/*
	 * Override default constructor
	 */
	Rectangle(){
	}
	/*
	 * Constructor
	 */
	public Rectangle(double x, double y, double width, double height, Color c) {
		super();
		this.c = c;
		this.y = y;
		this.x = x;
		this.width = width;
		this.height = height;
	}
	/*public Rectangle(Color color, boolean visible, BoundingBox bb1, double x, double y, double width, double height, Color c) {
		super(color, visible, bb1);
		super.bb1 = bb1;
		this.c = c;
		this.y = y;
		this.x = x;
		this.width = width;
		this.height = height;
	}*/
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public String toString() {
		return "X-value:" + x + " Y-value:" + y + " width:" + width + " height:" + height + " color:" + c;
	}
}
