public class Trebol {
	private String color;
	private int x;
	private int y;

	public Trebol(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void dibujar() {
		Cuadrado figura1 = new Cuadrado(color);
		Cuadrado figura2 = new Cuadrado(color);
		Cuadrado figura3 = new Cuadrado(color);

		figura1.changeSize(20);
		figura2.changeSize(20);
		figura3.changeSize(20);

		figura1.changePosition(new Posicion(x + 25, y + 45));
		figura2.changePosition(new Posicion(x + 45, y + 45));
		figura3.changePosition(new Posicion(x + 35, y + 25));

		figura1.makeVisible();
		figura2.makeVisible();
		figura3.makeVisible();
	}
}
