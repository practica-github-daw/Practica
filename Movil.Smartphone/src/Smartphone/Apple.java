package Smartphone;

public class Apple extends Smartphone{
        
	       private final int precio=900;
	       private String SistemaOperativo;
	       private String Procesador;
		
	       public Apple(String marca, String modelo, String color, String nombre, int pixelesCamara, int memoriaInterna,
				int memoriaExterna, String sistemaOperativo, String procesador) {
			super(marca, modelo, color, nombre, pixelesCamara, memoriaInterna, memoriaExterna);
			SistemaOperativo = sistemaOperativo;
			Procesador = procesador;
		}

		@Override
		public String toString() {
			return super.toString() + "Apple [precio=" + precio + ", SistemaOperativo=" + SistemaOperativo + ", Procesador=" + Procesador
					+ "]";
		}
	       
	       
	
	
         
}
