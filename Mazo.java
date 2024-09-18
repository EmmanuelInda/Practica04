import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	private ArrayList<Carta> cartas;
	private ArrayList<Carta> cartasRepartidas;

	public Mazo() {
		cartas = new ArrayList<>();
		cartasRepartidas = new ArrayList<>();
		inicializarMazo();
	}

	public void inicializarMazo() {
		for (Carta.Palo palo : Carta.Palo.values()) {
			for (int i = 1; i <= 13; ++i) {
				cartas.add(new Carta(i, palo));
			}
		}
	}

	public void barajear() {
		Collections.shuffle(cartas);
	}

	public ArrayList<Carta> repartir(int cantidad) {
		ArrayList<Carta> mano = new ArrayList<>();

		for (int i = 0; i < cantidad && !cartas.isEmpty(); ++i) {
			Carta carta = cartas.remove(0);
			mano.add(carta);
			cartasRepartidas.add(carta);
		}

		return mano;
	}

	public void recibirCartas(ArrayList<Carta> mano) {
		cartas.addAll(mano);
		cartasRepartidas.removeAll(mano);
	}

	public String estado() {
		return "Cartas en el mazo: " + cartas.size() + ", Cartas repartidas: " + cartasRepartidas.size();
	}
}
