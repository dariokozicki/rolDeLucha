package rolDeLucha.artefactos;
import rolDeLucha.*;

public class CollarDivino extends Artefacto{
	int perlas;
	public CollarDivino(int perlas) {
		this.perlas = perlas;
	}
	public int unidadesDeLucha(Rolando persona) {
		return perlas;
	}
}
