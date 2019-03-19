package rolDeLucha.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;



import rolDeLucha.*;
import rolDeLucha.artefactos.*;
import rolDeLucha.hechizosSet.*;

class test2TP1 {

	@Test
	void eliminarArtefactosDeRolandoYConocerHabDeLucha() {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		rolando.removerTodosLosArtefactos();
		assertEquals(1,rolando.habilidadParaLaLucha());
	}
	@Test
	void conocerHabilidadConTodosLosArtefactos() {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		assertEquals(13,rolando.habilidadParaLaLucha());
	}
	@Test
	void cambiarPerlasA3YConocerHabDeLucha() {
		CollarDivino collar = new CollarDivino(3);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		assertEquals(11,rolando.habilidadParaLaLucha());
	}
	@Test
	void cambiarValorBaseLuchaA8YConocerHabDeLucha() {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		rolando.setValorBaseLucha(8);
		assertEquals(20,rolando.habilidadParaLaLucha());
	}
	@Test
	void hacerEclipseYPreguntarValorDeMascaraOscura() {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		FuerzaOscura.get().eclipse();
		assertEquals(5,MascaraOscura.get().unidadesDeLucha(rolando));
		FuerzaOscura.get().revertirEclipse();
	}
	@Test
	void laMascaraOscurafunciona() {
		Rolando rolando = new Rolando(null,null);
		assertEquals(4,MascaraOscura.get().unidadesDeLucha(rolando));
	}
	
	@Test
	void eliminarMascaraOscuraYConocerHabDeLucha() {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
		
		rolando.removerArtefacto(MascaraOscura.get());
		assertEquals(9,rolando.habilidadParaLaLucha());
	}
}
