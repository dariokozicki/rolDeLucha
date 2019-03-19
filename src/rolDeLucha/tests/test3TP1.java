package rolDeLucha.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import rolDeLucha.*;
import rolDeLucha.artefactos.*;
import rolDeLucha.hechizosSet.EspectroMalefico;
import rolDeLucha.hechizosSet.Hechizo;
import rolDeLucha.hechizosSet.HechizoBasico;
import rolDeLucha.hechizosSet.LibroDeHechizos;

class test3TP1 {

	@Test
	void rolandoEstaCargado() {
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(new CollarDivino(5));
		artefactos.add(MascaraOscura.get());
		artefactos.add(new Armadura(RefuerzoNulo.get()));
		artefactos.add(Espejo.get());
		Rolando rolando = new Rolando(null,artefactos);
		
		assertTrue(rolando.estaCargado());
	}
	
	@Test
	void rolandoSeSacaLaArmaduraYNoEstaCargado() {
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(new CollarDivino(5));
		artefactos.add(MascaraOscura.get());
		Armadura armadura = new Armadura();
		artefactos.add(armadura);
		artefactos.add(Espejo.get());
		Rolando rolando = new Rolando(null,artefactos);
		rolando.removerArtefacto(armadura);
		
		assertFalse(rolando.estaCargado());
	}
	@Test
	void conocerHabDeLuchaDeRolando() {
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(new CollarDivino(5));
		artefactos.add(MascaraOscura.get());
		artefactos.add(new Armadura(RefuerzoNulo.get()));
		artefactos.add(Espejo.get());
		Rolando rolando = new Rolando(new EspectroMalefico(),artefactos);
		
		assertEquals(20,rolando.habilidadParaLaLucha());
	}
	@Test
	void rolandoTuvoUnaBendicion() {
		EspectroMalefico esp = new EspectroMalefico();
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(new CollarDivino(5));
		artefactos.add(MascaraOscura.get());
		Armadura armadura = new Armadura(Bendicion.get());
		artefactos.add(armadura);
		artefactos.add(Espejo.get());
		Rolando rolando = new Rolando(esp,artefactos);
		
		assertEquals(58,armadura.unidadesDeLucha(rolando));
	}
	@Test
	void conocerUnidadesDeLuchaDeArmaduraConCota() {
		Armadura armadura = new Armadura(CotaDeMalla.get());
		assertEquals(3,armadura.unidadesDeLucha(new Rolando(null,null)));
	}
	@Test
	void armaduraConHechizoBasico() {
		ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();
		Armadura armadura = new Armadura(HechizoBasico.get());
		assertEquals(12,armadura.unidadesDeLucha(new Rolando
										(new EspectroMalefico(),artefactos)));
	}
	@Test
	void armaduraConEspectroMalefico() {
		ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();
		Armadura armadura = new Armadura(new EspectroMalefico());
		assertEquals(19,armadura.unidadesDeLucha(new Rolando
						(new EspectroMalefico(),artefactos)));
	}
	@Test
	void habilidadConSoloEspejo() {
		ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(Espejo.get());
		Rolando rolando = new Rolando(new EspectroMalefico(),artefactos);
		assertEquals(1,rolando.habilidadParaLaLucha());
	}
	@Test
	void libroDeHechizosConMaleficoYBasico_ConocerHechiceria() {
		ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();
		hechizos.add(new EspectroMalefico());
		hechizos.add(HechizoBasico.get());
		LibroDeHechizos libro = new LibroDeHechizos(hechizos);
		Rolando rolando = new Rolando(libro,null);
		assertEquals(56,rolando.nivelDeHechiceria());
	}
}
