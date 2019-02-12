package Smartphone;

import Movil.Smartphone.Movil;

public class Smartphone extends Movil {

	// atributos nuevos de la clases hijo (herencia)
	private int PixelesCamara;
	private int MemoriaInterna;
	private int MemoriaExterna;

	// Constructor con las viejas y nuevas caracteristicas
	public Smartphone(String marca, String modelo, String color, int PixelesCamara, int MemoriaDiscoDuro,
			int MemoriaSD) {
		super(marca, modelo, color);
		this.PixelesCamara = PixelesCamara;
		this.MemoriaInterna = MemoriaDiscoDuro;
		this.MemoriaExterna = MemoriaSD;
	}

	public Smartphone() {
	}

	@Override
	public String toString() {
		String s;
		s = super.toString() + ",Pixelescamara:" + PixelesCamara + ",MemoriaInterna:" + MemoriaInterna
				+ ",MemoriaExterna:" + MemoriaExterna;

		return s;

	}

	public float getPixelesCamara() {
		return PixelesCamara;
	}

	public void setPixelesCamara(int pixelesCamara) {
		PixelesCamara = pixelesCamara;
	}

	public float getMemoriaInterna() {
		return MemoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		MemoriaInterna = memoriaInterna;
	}

	public float getMemoriaExterna() {
		return MemoriaExterna;
	}

	public void setMemoriaExterna(int memoriaExterna) {
		MemoriaExterna = memoriaExterna;
	}

}
