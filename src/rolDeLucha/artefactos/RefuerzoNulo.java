package rolDeLucha.artefactos;
import rolDeLucha.*;

public class RefuerzoNulo implements Refuerzo{
	private static final RefuerzoNulo refuerzo = new RefuerzoNulo();
	private RefuerzoNulo(){}
	
	public int unidadesDeLucha(Rolando persona) {
		return 0;
	}
	
	public static RefuerzoNulo get() {
		return refuerzo;
	}
}
