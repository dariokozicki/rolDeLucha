package rolDeLucha.artefactos;
import rolDeLucha.*;

public class CotaDeMalla implements Refuerzo{
	private static final CotaDeMalla cota = new CotaDeMalla();
	private CotaDeMalla() {}
	public static CotaDeMalla get() {
		return cota;
	}
	public int unidadesDeLucha(Rolando persona) {
		return 1;
	}
}
