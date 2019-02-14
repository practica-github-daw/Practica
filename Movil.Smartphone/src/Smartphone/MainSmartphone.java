package Smartphone;

import java.util.*;

public class MainSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un objeto tipo smartphone con el constructor vacio
		Scanner sc = new Scanner(System.in);
		Smartphone smartphone[] = new Smartphone[2];
        
		// le asigno las nuevas caracteristicas
		System.out.println("Que marca es el movil");
		String marca = sc.nextLine();
		System.out.println("Que modelo es el movil");
		String modelo = sc.nextLine();
		System.out.println("Que color es el movil");
		String color = sc.nextLine();
		System.out.println("Cuantos pixeles tiene la camara");
		String pixeles = sc.nextLine();
		System.out.println("Cuanta memoria interna tiene el movil");
		String MemoriaInterna = sc.nextLine();
		System.out.println("Cuanta memoria externa tiene el movil");
		String MemoriaExterna = sc.nextLine();
		

		System.out.print(" Las caracteristicas del movil " );	

	}

}
