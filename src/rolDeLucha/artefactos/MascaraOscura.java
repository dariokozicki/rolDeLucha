package rolDeLucha.artefactos;

import rolDeLucha.*;

public class MascaraOscura extends Artefacto{
	public int unidadesDeLucha(Rolando persona) {
		return Math.max(4, FuerzaOscura.get().valor()/2);
	}
}
