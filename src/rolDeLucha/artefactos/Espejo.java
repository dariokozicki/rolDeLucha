package rolDeLucha.artefactos;
import rolDeLucha.*;

public class Espejo extends Artefacto{
	public int unidadesDeLucha(Rolando persona) {
		if (persona.elMejorArtefacto()!=null)
			return persona.elMejorArtefacto().unidadesDeLucha(persona);
		return 0;
	}
	public boolean soyEspejo() {
		return true;
	}
}
