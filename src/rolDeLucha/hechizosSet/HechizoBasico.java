package rolDeLucha.hechizosSet;

public class HechizoBasico extends Hechizo{
	private static final HechizoBasico hech = new HechizoBasico();
	public int poder() {
		return 10;
	}
	private HechizoBasico() {}
	private HechizoBasico(String name) {}
	public static HechizoBasico get() {
		return hech;
	}
}
