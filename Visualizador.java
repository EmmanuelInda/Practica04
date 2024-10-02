public class Visualizador {
	public static void carta(Carta c, Posicion p) {
		int x = p.x;
		int y = p.y;
	
		Cuadrado contorno = new Cuadrado("black");
		Cuadrado relleno = new Cuadrado("white");
	
		contorno.changeSize(90);
		relleno.changeSize(80);
	
		contorno.changePosition(new Posicion(x, y));
		relleno.changePosition(new Posicion(x + 5, y + 5));
	
		contorno.makeVisible();
		relleno.makeVisible();
	
		if (c.getPalo() == Carta.Palo.TREBOL) {
			Trebol trebol = new Trebol(c.getColor(), x, y);
			trebol.dibujar();
		} else if (c.getPalo() == Carta.Palo.DIAMANTE) {
			Diamante diamante = new Diamante(c.getColor(), x, y);
			diamante.dibujar();
		} else if (c.getPalo() == Carta.Palo.CORAZON) {
			Corazon corazon = new Corazon(c.getColor(), x, y);
			corazon.dibujar();
		} else if (c.getPalo() == Carta.Palo.PICA) {
			Pica pica = new Pica(c.getColor(), x, y);
			pica.dibujar();
		}
	
		Circulo[] numeros = new Circulo[c.getValor()];
	
		for (int i = 0; i < numeros.length; ++i) {
			numeros[i] = new Circulo(c.getColor());
			numeros[i].changeSize(10);
	
			if (i < 8) {
				numeros[i].changePosition(new Posicion(x + 6, y + 5 + (10 * i)));
			} else {
				numeros[i].changePosition(new Posicion(x + 6 + ((10 * i) - 65), y + 75));
			}
	
			numeros[i].makeVisible();
		}
	}
}
