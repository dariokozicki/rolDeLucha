package rolDeLucha.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rolDeLucha.*;
import rolDeLucha.artefactos.*;
import rolDeLucha.hechizosSet.HechizoBasico;

class test2TP1 {

	@BeforeEach
	void setUp() throws Exception {
		CollarDivino collar = new CollarDivino(5);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		artefactos.add(collar);
		artefactos.add(EspadaDelDestino.get());
		artefactos.add(MascaraOscura.get());
		Rolando rolando = new Rolando(HechizoBasico.get(), artefactos);
	}

	@Test
	void eliminarArtefactosDeRolandoYConocerHabDeLucha() {
		//rolando.removerTodosLosArtefactos();
		
	}
	@Test
	void conocerHabilidadConTodosLosArtefactos() {
		
	}
	@Test
	void cambiarPerlasA3YConocerHabDeLucha() {
		
	}
	@Test
	void cambiarValorBaseLuchaA8YConocerHabDeLucha() {
		
	}
	@Test
	void hacerEclipseYPreguntarValorDeMascaraOscura() {
		
	}
	@Test
	void eliminarMascaraOscuraYConocerHabDeLucha() {
		
	}
}
