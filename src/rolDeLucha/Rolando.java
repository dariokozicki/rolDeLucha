package rolDeLucha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import rolDeLucha.artefactos.Artefacto;
import rolDeLucha.hechizosSet.Hechizo;



public class Rolando {
	Hechizo hechizoPreferido;
	int valorBaseLucha;
	ArrayList<Artefacto> artefactos;
	public Rolando(Hechizo hech,ArrayList<Artefacto> artefactos) {
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
	public void setValorBaseLucha(int valor) {
		valorBaseLucha = valor;
	}
	public int getValorBaesLucha() {
		return valorBaseLucha;
	}
	public boolean esLuchaMayorQueHechiceria() {
		return habilidadParaLaLucha()>nivelDeHechiceria();
	}
	public Artefacto elMejorArtefacto() {
		if (artefactos==null || artefactos.size()==0 || 
				(artefactos.size()==1 && artefactos.get(0).soyEspejo()) ) {
			return null;
		}
		return Collections.max(
				artefactos.stream()
					.filter(art->!art.soyEspejo())
					.collect(Collectors.toList())
				,Comparator.comparing(art->art.unidadesDeLucha(this)));
	}
	public boolean estaElArtefacto(Artefacto artefacto) {
		return artefactos.contains(artefacto);
	}
	public ArrayList<Artefacto> getArtefactos(){
		return artefactos;
	}
}