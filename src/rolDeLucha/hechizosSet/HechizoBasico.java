package rolDeLucha.hechizosSet;
import rolDeLucha.*;

public class HechizoBasico extends Hechizo{
	private static final HechizoBasico hech = new HechizoBasico();
	public int poder(Rolando persona) {
		return 10;
	}
	private HechizoBasico() {}
	private HechizoBasico(String name) {}
	public static HechizoBasico get() {
		return hech;
	}
}
