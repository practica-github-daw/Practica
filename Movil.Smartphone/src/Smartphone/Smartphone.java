package Smartphone;

public class Smartphone {

	// atributos nuevos de la clases hijo (herencia)
	private String marca;
	private String modelo;
	private String color;
	private String nombre;
	private int PixelesCamara;
	private int MemoriaInterna;
	private int MemoriaExterna;
	

	public Smartphone(String marca, String modelo, String color, String nombre, int pixelesCamara, int memoriaInterna,
			int memoriaExterna) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombre = nombre;
		PixelesCamara = pixelesCamara;
		MemoriaInterna = memoriaInterna;
		MemoriaExterna = memoriaExterna;
	}


	public Smartphone() {
	
	}


	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", nombre=" + nombre
				+ ", PixelesCamara=" + PixelesCamara + ", MemoriaInterna=" + MemoriaInterna + ", MemoriaExterna="
				+ MemoriaExterna + "]";
	}

}
	
    
	