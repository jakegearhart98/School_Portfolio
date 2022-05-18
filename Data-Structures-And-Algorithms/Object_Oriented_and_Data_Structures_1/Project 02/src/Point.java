
public abstract class Point {
	protected final double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	//end getters
	//Don't need setters, class immutable
	
}
