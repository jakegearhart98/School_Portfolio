import java.awt.Color;
import java.lang.Math;
	class Ellipse extends Figure {
		
		private double x, y, ha, va;
		private Color c;
		
		public Ellipse() {
		}
		
		public Ellipse(double x, double y, double ha, double va, Color c) {
			super();
			this.x = x;
			this.y = y;
			this.ha = ha;
			this.va = va;
			this.c = c;
		}
		
		public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
		public double getHa() {
			return ha;
		}
		public double getVa() {
			return va;
		}
		public double area() {
			return Math.PI * ha * va;
		}
		public String toString() {
			return "X-value: " + x + " Y-value: " + y + " Horizontal Axis: " + ha + " Vertical Axis: " + va + " Color: " + c.toString();
		}
}
