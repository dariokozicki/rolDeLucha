package rolDeLucha.artefactos;

import rolDeLucha.*;

public class Bendicion implements Refuerzo{
	private static final Bendicion ben = new Bendicion();
	private Bendicion() {}
	public int unidadesDeLucha(Rolando persona) {
		return persona.nivelDeHechiceria();
	}
	public static Bendicion get() {
		return ben;
	}
}
