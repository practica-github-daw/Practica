package Smartphone;
import java.util.*;
public class MainSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un objeto tipo smartphone con el constructor vacio
		Scanner sc=new Scanner (System.in);
		Smartphone smartphone = new Smartphone();
		//le asigno las nuevas caracteristicas
		    smartphone.setMarca("Xiaomi");
			smartphone.setModelo("A2lite");
			smartphone.setColor("Azul");
			smartphone.setPixelesCamara(12);
			smartphone.setMemoriaInterna(16) ;
			smartphone.setMemoriaExterna(32);
		//utilizo los metodos
	        System.out.println(" A quien desea llamar ");
	        sc.nextLine();
			smartphone.HacerLLamada();
	        smartphone.CortarLlamada();
	        System.out.println();
	     //metodo sobreescrito   
	        System.out.println(" La caracteristicas del movil son " + smartphone);
	
	}
	
}
