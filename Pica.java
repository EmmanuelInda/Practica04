public class Pica {
	private String color;
	private int x;
	private int y;

	public Pica(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void dibujar() {
		Triangulo figura = new Triangulo(color);

		figura.changeSize(0.5);

		figura.changePosition(new Posicion(x + 45, y + 30));

		figura.makeVisible();
	}
}
