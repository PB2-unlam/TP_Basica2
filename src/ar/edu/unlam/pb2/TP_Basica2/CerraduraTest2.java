package ar.edu.unlam.pb2.TP_Basica2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CerraduraTest2 {

	@Test
	//queUnaCerraduraNuevaEstaCerrada
	public void queUnaCerraduraNuevaEstaCerrada() {//Todas las funciones de @Test son void porque no devuelven nada.
		Cerradura miCerraduraNueva = new Cerradura(1234, 2);
		Boolean estadoCerraduraNueva = miCerraduraNueva.estaCerrada();
		Assert.assertTrue(estadoCerraduraNueva);
	}
	
	@Test
	//queCuandoIngresoClaveCorrectaSeAbra
	public void queCuandoIngresoClaveCorrectaSeAbra() {
		Cerradura cerraduraQueSeAbre = new Cerradura(5219, 3);
		Boolean seAbrio = cerraduraQueSeAbre.abrir(5219);
		Assert.assertTrue(seAbrio);
	}
	
	@Test
	//queCuandoIngresoClaveIncorrectaNoSeAbra
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
		Cerradura noSeTieneQueAbrir = new Cerradura(1234, 2);
		Boolean seAbrio = noSeTieneQueAbrir.abrir(12345);
		Assert.assertFalse(seAbrio);
	}
	
	@Test
	//queSeBloqueeDespuesDeLosIntentos
	public void queSeBloqueeDespuesDeLosIntentos() {
		Cerradura cerraduraBloqueada = new Cerradura(1234, 2);
		cerraduraBloqueada.abrir(123);
		cerraduraBloqueada.abrir(12);
		Boolean seBloqueo = cerraduraBloqueada.fueBloqueada();
		Assert.assertTrue(seBloqueo);
	}
	
	
	
}
