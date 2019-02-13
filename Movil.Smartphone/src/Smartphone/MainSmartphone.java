package Smartphone;

import java.util.*;

public class MainSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un objeto tipo smartphone con el constructor vacio
		Scanner sc = new Scanner(System.in);
		Smartphone smartphone = new Smartphone();

		// le asigno las nuevas caracteristicas
		System.out.println("Que marca es el movil");
		String marca = sc.nextLine();

		System.out.println("Que modelo es el movil");
		String modelo = sc.nextLine();

		System.out.println("Que color es el movil");

		smartphone.getColor();
		System.out.println("Cuantos pixeles tiene la camara");

		smartphone.getPixelesCamara();
		System.out.println("Cuanta memoria interna tiene el movi");

		smartphone.getMemoriaInterna();
		System.out.println("Cuanta memoria externa tiene el movi");
		String MemoriaExterna = sc.nextLine();
		smartphone.getMemoriaExterna();

		// utilizo los metodos
		System.out.println(" A quien desea llamar ");
		String nombre = sc.nextLine();
		smartphone.HacerLLamada(nombre);
		smartphone.CortarLlamada(nombre);
		smartphone.getNombre();
		smartphone.getNombre();
		System.out.println();
		// metodo sobreescrito
		System.out.println(" La caracteristicas del movil son " + smartphone);

	}

}
