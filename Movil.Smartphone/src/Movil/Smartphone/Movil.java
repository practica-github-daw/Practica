package Movil.Smartphone;

public class Movil {

	// Ejemplo: Voy a crear una clase celular, con sus atributos: color, modelo,
	// marca, con dos constructores y
	// los métodos llamar, cortar llamada, informar características y los
	// métodos getters y setters que permiten
	// acceder a los atributos de la clase.

	// atributos
	private String marca;
	private String modelo;
	private String color;
	private String nombre;

	// constructor
	public Movil(String marca, String modelo, String color,String nombre) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombre = nombre;
	}
	// constructor vacio

	public Movil() {

	}

	// toString
	@Override
	public String toString() {
		return "marca=" + marca + ",modelo=" + modelo + ",color= " + color;
	}

	// metodo llamar
	public void HacerLLamada(String nombre) {
		System.out.println(" Llamada a " + nombre);
	
	} 

	// metodo cortar llamada
	public void CortarLlamada(String nombre) {
		System.out.println(" Cortar Llamada " + nombre);
	}
	// metodo informarcaracteristicas

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}