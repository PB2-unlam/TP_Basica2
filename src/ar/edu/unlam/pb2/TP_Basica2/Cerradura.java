package ar.edu.unlam.pb2.TP_Basica2;

public class Cerradura {
	
	//Atributos
	private Integer claveDeApertura, cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estadoCerradura;
	private Integer aperturasExitosas, aperturasFallidas;
	
	//Constructor
	public Cerradura (Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estadoCerradura = false;
		this.aperturasExitosas = 0;
		this.aperturasFallidas = 0;
	}
	
	//Metodos
	public Boolean abrir(Integer clave) {
		if(this.claveDeApertura == clave) {
			this.estadoCerradura = true;
			this.aperturasExitosas+=1;
			this.aperturasFallidas=0;
		} else {
			this.aperturasFallidas+=1;
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
		if(this.aperturasFallidas >= this.cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		} else {
			return false;
		}
	}
	
	public Integer contarAperturasExitosas() {
		return this.aperturasExitosas;
	}
	
	public Integer contarAperturasFallidas() {
		return this.aperturasFallidas;
	}
	
}
