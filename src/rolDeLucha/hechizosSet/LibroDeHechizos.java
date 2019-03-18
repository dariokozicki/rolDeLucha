package rolDeLucha.hechizosSet;
import java.util.ArrayList;

import rolDeLucha.*;

public class LibroDeHechizos extends Hechizo{
	ArrayList<Hechizo> hechizos;
	public LibroDeHechizos(ArrayList<Hechizo> hechizos) {
		this.hechizos = hechizos;
	}
	public int poder(Rolando persona) {
		return hechizos.stream()
					   .map(hech->hech.poder(persona))
					   .reduce(0,Integer::sum);
	}
	
}
