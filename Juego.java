public class Juego {
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		mazo.barajear();

		System.out.println(mazo.estado() + "\n");

		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");
		jugador1.nombre = "Emmanuel";
		jugador2.nombre = "Olguin";

		jugador1.recibirCartas(mazo.repartir(5));
		jugador2.recibirCartas(mazo.repartir(5));

		System.out.println(jugador1);
		System.out.println(jugador2);

		System.out.println(mazo.estado());

		mazo.recibirCartas(jugador1.devolverCartas(2));
		mazo.recibirCartas(jugador2.devolverCartas(2));

		System.out.println(jugador1);
		System.out.println(jugador2);

		System.out.println(mazo.estado());

		jugador1.recibirCartas(mazo.repartir(2));
		jugador2.recibirCartas(mazo.repartir(2));

		System.out.println(mazo.estado());

		mazo.recibirCartas(jugador1.devolverCartas(5));
		mazo.recibirCartas(jugador2.devolverCartas(5));

		System.out.println(mazo.estado());
	}
}
