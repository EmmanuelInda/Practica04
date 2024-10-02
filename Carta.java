public class Carta {
	public enum Palo { TREBOL, DIAMANTE, CORAZON, PICA }

	private int valor;
	private Palo palo;
	private String color;

	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
		this.color = asignarColor(palo);
	}

	private String asignarColor(Palo palo) {
		return switch (palo) {
			case TREBOL, PICA -> "black";
			case DIAMANTE, CORAZON -> "red";
		};
	}

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		String valorString = switch (valor) {
			case 1 -> "A";
			case 11 -> "J";
			case 12 -> "Q";
			case 13 -> "K";
			default -> String.valueOf(valor);
		};
		String paloString = palo.toString();

		return "(" + valorString + ", " + paloString + ")";
	}
}
