package rolDeLucha.hechizosSet;
import java.util.ArrayList;



public class LibroDeHechizos extends Hechizo{
	ArrayList<Hechizo> hechizos;
	public LibroDeHechizos(ArrayList<Hechizo> hechizos) {
		this.hechizos = hechizos;
	}
	public int poder() {
		return hechizos.stream()
					   .filter(hech->hech.esPoderoso())
					   .map(hech->hech.poder())
					   .reduce(0,Integer::sum);
	}
	
}
