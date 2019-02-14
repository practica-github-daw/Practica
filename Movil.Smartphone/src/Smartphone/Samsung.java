package Smartphone;

public class Samsung extends Smartphone {

	private String ReconocimientoFacial;
	private String MemoriaRam;
	private int NumeroCamaras;
	
	
	public Samsung(String marca, String modelo, String color, String nombre, int pixelesCamara, int memoriaInterna,
			int memoriaExterna, String reconocimientoFacial, String memoriaRam, int numeroCamaras) {
		super(marca, modelo, color, nombre, pixelesCamara, memoriaInterna, memoriaExterna);
		ReconocimientoFacial = reconocimientoFacial;
		MemoriaRam = memoriaRam;
		NumeroCamaras = numeroCamaras;
	}


	@Override
	public String toString() {
		return super.toString() + "Samsung [ReconocimientoFacial=" + ReconocimientoFacial + ", MemoriaRam=" + MemoriaRam
				+ ", NumeroCamaras=" + NumeroCamaras + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
}
