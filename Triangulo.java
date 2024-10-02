import java.awt.Polygon;

public class Triangulo extends Triangle {
	public Triangulo(String color) {
		super();
		this.color = color;
	}
	
	public void rotar() {
		erase();

		int centerX = xPosition;
		int centerY = yPosition + height / 2;

		yPosition = centerY + height / 2;
		height = -height;

		draw();
	}
	
	public void changePosition(Posicion p) {
		erase();
		this.xPosition = p.x;
		this.yPosition = p.y;
		draw();
	}
	
	public void changeSize(double scaleFactor) {
		if (scaleFactor <= 0) {
			System.out.println("Scale factor must be positive");
			return;
		}

		erase();
		height = (int) (height * scaleFactor);
		width = (int) (width * scaleFactor);
		draw();
	}
	
	@Override
	protected void draw() {
		if(isVisible) {
			Canvas canvas = Canvas.getCanvas();
			int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
			int[] ypoints = { yPosition, yPosition + height, yPosition + height };
			canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
			canvas.wait(10);
		}
	}
	
	@Override
	protected void erase() {
		if(isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.erase(this);
		}
	}
}
