package ar.edu.unlam.pb2.TP_Basica2;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	@Test
	
	public void queUnaCerraduraNuevaEstaCerrada(){
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.cerrar();
		Boolean valorEsperado = true;
		Assert.assertEquals(valorEsperado, miCerradura.estaCerrada());
	}


	@Test
	
	public void queCuandoIngresoClaveCorrectaSeAbra(){
		Cerradura miCerradura = new Cerradura(4321,3);
		Boolean valorEsperado = true;
		miCerradura.abrir(4321);
		Assert.assertEquals(valorEsperado,miCerradura.estaAbierta());
	}
	
@Test
	
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
		Cerradura miCerradura = new Cerradura(4321,3);
		Boolean valorEsperado = false;
		miCerradura.abrir(4321);
		miCerradura.cerrar();
		miCerradura.abrir(5555);
		Assert.assertEquals(valorEsperado, miCerradura.estaAbierta());
	}
	
@Test

public void queCuandoIngresoTresClaveIncorrectaSeBloquea(){
	Cerradura miCerradura = new Cerradura(4321,3);
	Boolean valorEsperado = true;
	miCerradura.abrir(5554);
	miCerradura.abrir(5553);
	miCerradura.abrir(5555);
	Assert.assertEquals(valorEsperado, miCerradura.fueBloqueada());
}


}	
