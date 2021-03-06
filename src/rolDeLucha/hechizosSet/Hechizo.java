package rolDeLucha.hechizosSet;
import rolDeLucha.*;
import rolDeLucha.artefactos.Refuerzo;

public abstract class Hechizo implements Refuerzo {
	String name;
	public int poder() {
		return 0;
	}
	public boolean esPoderoso() {
		return poder()>15;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int unidadesDeLucha(Rolando persona) {
		return poder();
	}
}
