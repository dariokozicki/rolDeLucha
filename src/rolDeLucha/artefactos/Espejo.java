package rolDeLucha.artefactos;
import java.util.stream.Collectors;

import rolDeLucha.*;

public class Espejo extends Artefacto{ 
	private static final Espejo espejo = new Espejo();
	private Espejo() {}
	
	public int unidadesDeLucha(Rolando persona) {
		if (persona.getArtefactos().size()>1)
			return persona.elMejorArtefacto(
					            persona.getArtefactos().stream()
					            .filter(art->art!=this)
					            .collect(Collectors.toList())
					).unidadesDeLucha(persona);
		return 0;
	}
	public static Espejo get() {
		return espejo;
	}
}
