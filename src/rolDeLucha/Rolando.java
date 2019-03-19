package rolDeLucha;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.stream.Collectors;
import java.util.List;

import rolDeLucha.artefactos.Artefacto;
import rolDeLucha.hechizosSet.Hechizo;



public class Rolando {
	Hechizo hechizoPreferido;
	int valorBaseLucha;
	List<Artefacto> artefactos;
	public Rolando(Hechizo hech,List<Artefacto> artefactos) {
		hechizoPreferido = hech;
		valorBaseLucha = 1;
		this.artefactos = artefactos;
	}
	public int nivelDeHechiceria() {
		return 3*hechizoPreferido.poder(this)+FuerzaOscura.get().valor();
	}
	public void setHechizoPreferido(Hechizo hech) {
		hechizoPreferido = hech;
	}
	public Hechizo getHechizoPreferido() {
		return hechizoPreferido;
	}
	public boolean seCreePoderoso() {
		return hechizoPreferido.esPoderoso(this);
	}
	public int habilidadParaLaLucha() {
		return valorBaseLucha + artefactos.stream()
										  .map(artef->artef.unidadesDeLucha(this))
										  .reduce(0, Integer::sum);
	}
	public void agregarArtefacto(Artefacto artefacto) {
		artefactos.add(artefacto);
	}
	public void removerArtefacto(Artefacto artefacto) {
		artefactos.remove(artefacto);
	}
	public void removerTodosLosArtefactos() {
		artefactos.removeAll(artefactos);
	}
	public void setValorBaseLucha(int valor) {
		valorBaseLucha = valor;
	}
	public int getValorBaesLucha() {
		return valorBaseLucha;
	}
	public boolean esLuchaMayorQueHechiceria() {
		return habilidadParaLaLucha()>nivelDeHechiceria();
	}
	public Artefacto elMejorArtefacto(List<Artefacto> artefactos) {
		if (artefactos.size()==0) {
			return null;
		}
		return Collections.max(
				artefactos
				,Comparator.comparing(art->art.unidadesDeLucha(this)));
	}
	public boolean estaElArtefacto(Artefacto artefacto) {
		return artefactos.contains(artefacto);
	}
	public List<Artefacto> getArtefactos(){
		return artefactos;
	}
	public boolean estaCargado() {
		return artefactos.size()>=5;
	}
	
}
