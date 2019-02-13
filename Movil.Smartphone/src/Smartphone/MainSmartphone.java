package Smartphone;

import java.util.*;

public class MainSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo un objeto tipo smartphone con el constructor vacio
		int sumamegapixeles=0;
		Scanner sc = new Scanner(System.in);
		Smartphone smartphone[] = new Smartphone[5];
		// le asigno las nuevas caracteristicas
		for (int i=0;i<smartphone.length;i++){
		System.out.println(" De que marca es su movil ");
		String marca = sc.nextLine();
		System.out.println(" Modelo del movil ");
		String modelo = sc.nextLine();
		System.out.println(" Color del mismo ");
		String color = sc.nextLine();
		System.out.println("Cuantos pixeles tiene su camara ");
		String PixelesCamara = sc.nextLine();
		System.out.println(" Cuanta capacidad de memoria interna tiene");
		String MemoriaInterna = sc.nextLine();
		System.out.println(" Cuanta capacidad de memoria externa tiene");
		String MemoriaExterna = sc.nextLine();
		}
		smartphone[i]=new Smartphone(marca,modelo,color);
		// utilizo los metodos
		System.out.println(" A quien desea llamar ");
		String nombre = sc.nextLine();
		// metodo sobreescrito
		System.out.println(" La caracteristicas del movil son " + smartphone);
	}
}

/*
 * import javax.swing.JOptionPane; public class EmpleadoApp {
 * 
 * public static void main(String[] args) {
 * 
 * //Creamos un array de objetos de la clase empleados Empleado
 * arrayObjetos[]=new Empleado[10];
 * 
 * //Creamos 10 empleados por defecto int suma=0; for (int
 * i=0;i<arrayObjetos.length;i++){ //Indicamos cada uno de los parametros del
 * objeto String nombre=JOptionPane.showInputDialog("Escribe un nombre");
 * 
 * String apellido=JOptionPane.showInputDialog("Escribe un apellido");
 * 
 * String texto=JOptionPane.showInputDialog("Escribe una edad"); int
 * edad=Integer.parseInt(texto);
 * 
 * texto=JOptionPane.showInputDialog("Escribe un salario"); double
 * salario=Double.parseDouble(texto);
 * 
 * arrayObjetos[i]=new Empleado(nombre, apellido, edad, salario); }
 * 
 * //Lo recorremos y sumamos de nuevo los salarios for (int
 * i=0;i<arrayObjetos.length;i++){ //Mostramos la direccion del objeto
 * System.out.println(arrayObjetos[i]); suma+=arrayObjetos[i].getSalario(); }
 * System.out.println("La suma de salarios es "+suma); }
 * 
 * }
 * 
 * }
 * 
 * }
 */
