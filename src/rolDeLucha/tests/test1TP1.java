package rolDeLucha.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import rolDeLucha.Rolando;
import rolDeLucha.artefactos.Artefacto;
import rolDeLucha.artefactos.EspadaDelDestino;
import rolDeLucha.artefactos.MascaraOscura;
import rolDeLucha.hechizosSet.EspectroMalefico;
import rolDeLucha.hechizosSet.HechizoBasico;

class test1TP1 {

	@Test
	void nivelDeHechiceriadeRolando() {
		EspectroMalefico espectro = new EspectroMalefico();
		ArrayList<Artefacto> artefactos = null;
		Rolando rolando = new Rolando(espectro,artefactos);
		assertEquals(56,rolando.nivelDeHechiceria());
	}
	@Test
	void cambiarNombreDeEspectroMalefico() {
		EspectroMalefico espectro = new EspectroMalefico();
		ArrayList<Artefacto> artefactos = null;
		Rolando rolando = new Rolando(espectro,artefactos);
		espectro.setName("espectro superrecontramalefico muajajaja");
		assertEquals(125,rolando.nivelDeHechiceria());
	}
	@Test
	void cambiarHechizoaBasico() {
		EspectroMalefico espectro = new EspectroMalefico();
		ArrayList<Artefacto> artefactos = null;
		Rolando rolando = new Rolando(espectro,artefactos);
		HechizoBasico basico = new HechizoBasico();
		rolando.setHechizoPreferido(basico);
		assertEquals(35,rolando.nivelDeHechiceria());
	}
	@Test
	void habilidadParaLaLucha() {
		EspectroMalefico espectro = new EspectroMalefico();
		ArrayList<Artefacto> artefactos = new ArrayList<Artefacto>();
		EspadaDelDestino espada = new EspadaDelDestino();
		MascaraOscura mascara = new MascaraOscura();
		artefactos.add(espada);
		artefactos.add(mascara);
		Rolando rolando = new Rolando(espectro,artefactos);
		assertEquals(8,rolando.habilidadParaLaLucha());
	}
	
}
