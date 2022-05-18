import java.awt.Color;
import java.lang.Math;
	
	class Circle extends Ellipse{
	private double x, y, radius;
	private Color c;
	
	public Circle(double x, double y, double radius, Color c) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.c = c;
	}
	public double area() {
		return Math.pow((Math.PI * radius), 2);
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public String toString() {
		return "X-value: " + x + " Y-value: " + y + " Radius: " + radius + " Color: " + c.toString();
	}
}
