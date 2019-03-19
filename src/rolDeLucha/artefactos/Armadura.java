package rolDeLucha.artefactos;
import rolDeLucha.*;

public class Armadura extends Artefacto{
	Refuerzo refuerzo = RefuerzoNulo.get();
	public Armadura(Refuerzo refuerzo) {
		this.refuerzo = refuerzo;
	}
	public Armadura() {}
	public int unidadesDeLucha(Rolando persona) {
		return 2 + refuerzo.unidadesDeLucha(persona);
	}
}
