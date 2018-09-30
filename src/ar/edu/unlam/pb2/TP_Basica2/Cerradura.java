package ar.edu.unlam.pb2.TP_Basica2;

public class Cerradura {
	
	//Atributos
	private Integer claveDeApertura, cantidadDeFallosConsecutivosQueLaBloquean;
	private Integer aperturasExitosas, aperturasFallidas;
	private Boolean estadoCerradura, estaBloqueada;
	
	//Constructor
	public Cerradura (Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estadoCerradura = false;
		this.aperturasExitosas = 0;
		this.aperturasFallidas = 0;
		this.estaBloqueada= false;
	}
	
	//Metodos
	public Boolean abrir(Integer clave) {
			if(claveDeApertura.equals(clave) && this.estaBloqueada == false) {
				//Cuento apertura, reseteo fallidas y abro la cerradura
				this.estadoCerradura = true;
				this.aperturasExitosas+=1;
				this.aperturasFallidas=0;
			} else {
				this.aperturasFallidas+=1;
				if(this.aperturasFallidas >= this.cantidadDeFallosConsecutivosQueLaBloquean) {
				this.estaBloqueada=true;
			}
		}
		
		return this.estadoCerradura;
	}
	
	public void cerrar() {
		this.estadoCerradura = false;
	}
	
	public Boolean estaAbierta() {
		return this.estadoCerradura;
	}
	
	public Boolean estaCerrada() {
		return !this.estadoCerradura;
	}
	
	public Boolean fueBloqueada() {
			return this.estaBloqueada;
	}
	
	public Integer contarAperturasExitosas() {
		return this.aperturasExitosas;
	}
	
	public Integer contarAperturasFallidas() {
		return this.aperturasFallidas;
	}
	
}
