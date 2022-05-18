/*
 * @author Jake Gearhart
 * @version 9/14/2021
 */
	public class Point{
	/*
	 * @param x: protected final double for X coordinate
	 * @param y: protected final double for Y coordinate
	 */
	private final double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * Returns x
	 */
	public double getX() {
		return x;
	}
	/*
	 * Returns y
	 */
	public double getY() {
		return y;
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return "X value: " + x + "Y value: " + y;
	}
	//Add equals method
}
