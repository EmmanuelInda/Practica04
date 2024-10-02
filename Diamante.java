public class Diamante {
	private String color;
	private int x;
	private int y;

	public Diamante(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void dibujar() {
		Triangulo figura1 = new Triangulo(color);
		Triangulo figura2 = new Triangulo(color);

		figura1.changeSize(0.3);
		figura2.changeSize(0.3);

		figura1.changePosition(new Posicion(x + 45, y + 30));
		figura2.changePosition(new Posicion(x + 45, y + 45));

		figura2.rotar();

		figura1.makeVisible();
		figura2.makeVisible();
	}
}
