package rolDeLucha.artefactos;
import rolDeLucha.*;

public class EspadaDelDestino extends Artefacto{
	private static final EspadaDelDestino espada = new EspadaDelDestino();
	private EspadaDelDestino() {
	}
	public int unidadesDeLucha(Rolando persona) {
		return 3;
	}
	public static EspadaDelDestino get() {
		return espada;
	}
}
