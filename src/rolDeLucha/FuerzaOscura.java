package rolDeLucha;

public class FuerzaOscura {
	private int valor = 5;
	private static final FuerzaOscura fo= new FuerzaOscura();
	private FuerzaOscura() {
		valor=5;
	}
	public static FuerzaOscura get() {
		return fo;
	}
	public void eclipse() {
		valor*=2;
	}
	public void revertirEclipse() {
		valor/=2;
	}
	public int valor() {
		return valor;
	}
}
