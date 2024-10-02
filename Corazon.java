public class Corazon {
	private String color;
	private int x;
	private int y;

	public Corazon(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void dibujar() {
		Circulo figura1 = new Circulo(color);
		Circulo figura2 = new Circulo(color);
		Triangulo figura3 = new Triangulo(color);

		figura1.changeSize(17);
		figura2.changeSize(17);
		figura3.changeSize(0.3);

		figura1.changePosition(new Posicion(x + 30, y + 30));
		figura2.changePosition(new Posicion(x + 42, y + 30));
		figura3.changePosition(new Posicion(x + 45, y + 45));

		figura3.rotar();

		figura1.makeVisible();
		figura2.makeVisible();
		figura3.makeVisible();
	}
}
