import java.awt.*;
import java.awt.geom.*;

public class Circulo extends Circle {
	public Circulo(String color) {
		super();
		this.color = color;
	}
	
	public void changePosition(Posicion p) {
		erase();
		this.xPosition = p.x;
		this.yPosition = p.y;
		draw();
	}
}
