package rolDeLucha.artefactos;

import rolDeLucha.*;

public class Bendicion implements Refuerzo{
	public int unidadesDeLucha(Rolando persona) {
		return persona.nivelDeHechiceria();
	}
}
