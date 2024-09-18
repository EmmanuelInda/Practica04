import java.util.ArrayList;

public class Jugador {
	public String nombre;
	private ArrayList<Carta> mano;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mano = new ArrayList<>();
	}

	public void recibirCartas(ArrayList<Carta> cartas) {
		mano.addAll(cartas);
	}

	public ArrayList<Carta> devolverCartas(int cantidad) {
		ArrayList<Carta> cartasDevueltas = new ArrayList<>();

		for (int i = 0; i < cantidad; ++i)
			cartasDevueltas.add(mano.remove(0));

		return cartasDevueltas;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Jugador: ").append(nombre).append("\nCartas:\n");
		for (Carta carta : mano) {
			sb.append(carta.toString()).append("\n");
		}

		return sb.toString();
	}
}
