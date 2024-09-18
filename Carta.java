public class Carta {
	public enum Palo { TREBOL, DIAMANTE, CORAZON, PICA }

	private int valor;
	private Palo palo;

	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
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
