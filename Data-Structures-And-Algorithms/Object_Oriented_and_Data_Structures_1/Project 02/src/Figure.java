import java.awt.Color;

public abstract class Figure {

	protected boolean visible;
	protected Color color;
	
	
	//Constructor
	public Figure(Color color, boolean visible) {
		this.color = color;
		this.visible = visible;
	}
	public void setColor(Color c) {
		this.color = c;
	}
	public void makeVisible() {
		visible = true;
	}
	public void makeInVisible() {
		visible = false;
	}
	
}
