public class Cuadrado extends Square {
	public Cuadrado(String color) {
		super();
		this.color = color;
	}

	public void changePosition(Posicion p) {
		this.xPosition = p.x;
		this.yPosition = p.y;
	}
}
