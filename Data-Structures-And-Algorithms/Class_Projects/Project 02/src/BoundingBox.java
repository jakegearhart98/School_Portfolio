/*
 * @author Jake Gearhart
 * @version 9/14/2021
 */
	public class BoundingBox{
	/*
	 * @param p1: immutable point object for X and Y coordinates
	 * @param width: immutable double for width of bounding box
	 * @param height: immutable double for height of bounding box
	 */
	Point p1;
	private final double width, height;
	/*
	 * Constructor for BoundingBox
	 */
	public BoundingBox(Point p1, double width, double height) {
		this.p1 = p1;
		this.width = width;
		this.height = height;
	}
	/*
	 * Returns width
	 */
	public double getWidth() {
		return width;
	}
	/*
	 * Returns height
	 */
	public double getHeight() {
		return height;
	}
	/*
	 * Returns point
	 */
	public Point getPoint() {
		return p1;
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return "X-value: " + p1.getX() + " Y-value: " + p1.getY() + " Width: " + width + " Height: " + height;
	}
	//write equals method
}
