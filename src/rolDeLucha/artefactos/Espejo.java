package rolDeLucha.artefactos;
import java.util.stream.Collectors;

import rolDeLucha.*;

public class Espejo extends Artefacto{
	public int unidadesDeLucha(Rolando persona) {
		if (persona.elMejorArtefacto(persona.getArtefactos())!=null
				|| (persona.getArtefactos().size()==1 && persona.getArtefactos().contains(this)))
			return persona.elMejorArtefacto(
					            persona.getArtefactos().stream()
					            .filter(art->art!=this)
					            .collect(Collectors.toList())
					).unidadesDeLucha(persona);
		return 0;
	}
	
}
