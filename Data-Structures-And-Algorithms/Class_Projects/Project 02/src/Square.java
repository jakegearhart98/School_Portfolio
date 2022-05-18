import java.awt.Color;

	class Square extends Rectangle {
		
		private double x, y, length;
		private Color c;
		public Square(double x, double y, double length, Color c) {
			this.x = x;
			this.y = y;
			this.length = length;
			this.c = c;
		}
		/*
		 * Returns length
		 */
		public double getLength() {
			return length;
		}
		/*
		 * Calculates area
		 * returns length
		 */
		public double area() {
			return length * 2;
		}
		@Override
		public String toString() {
			return "X-value: " + x + " Y-value: " + y + " Length of side: " + length + " Color: " + color;
		}
}
