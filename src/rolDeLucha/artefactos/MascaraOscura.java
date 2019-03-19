package rolDeLucha.artefactos;

import rolDeLucha.*;

public class MascaraOscura extends Artefacto{
	private static final MascaraOscura mascara = new MascaraOscura();
	
	private MascaraOscura() {}
	
	public int unidadesDeLucha(Rolando persona) {
		return Math.max(4, FuerzaOscura.get().valor()/2);
	}
	
	public static MascaraOscura get() {
		return mascara;
	}
}
