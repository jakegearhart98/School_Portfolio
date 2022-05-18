import java.awt.Color;
public class FigureDriver {

	public static void main(String[] args) {
		Color c = Color.yellow;
		boolean vissy = true;
		Point p1 = new Point(234,645);
		
		BoundingBox bb1 = new BoundingBox(p1, 44.6, 78.6);
		System.out.println("BoundingBox: " + bb1);
		Rectangle rect = new Rectangle(34, 56, 59, 77, c);
		//System.out.println("Rectangle area: " + rect.area());
		Circle c1 = new Circle(23,54,65,c);
		//System.out.println("Circle area: " + c1.area());
		//System.out.println(c1);	
		Square sq1 = new Square(65, 78, 4, c);
		//System.out.println(sq1);
		//System.out.println(p1);
		System.out.println("Point before dialate: " + bb1.getPoint());
		//Figure f1 = new Figure(c, vissy, bb1);
		//System.out.print(sq1.dilate(3));
		Figure f1 = new Rectangle(32, 54,876.4, 234.98, c);
		
		Figure f2 = new Rectangle(23,856,345,345,c);
		f2.dilate(3);
		System.out.println(f1);
		
		System.out.println(f2);
		
		Point p2 = new Point(234,345);
	}

}
