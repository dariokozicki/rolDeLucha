package rolDeLucha.artefactos;
import rolDeLucha.*;

public class Armadura extends Artefacto{
	Refuerzo refuerzo;
	public Armadura(Refuerzo refuerzo) {
		this.refuerzo = refuerzo;
	}
	public int unidadesDeLucha(Rolando persona) {
		return 2 + refuerzo.unidadesDeLucha(persona);
	}
}
