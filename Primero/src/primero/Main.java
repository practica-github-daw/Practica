package primero;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Vector<Coche> coches = new Vector();
		Scanner sc = new Scanner(System.in);
		int opc;

		do {
			System.out.println("Anota opcion:\n1.Llega coche\n2.Se va coche\n3.Mostrar coches de la cola\n4.Buscar\n5.Borrar\n6.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Anota matricula");
				String matricula = sc.nextLine();
				coches.add(new Coche(matricula));
				break;
			case 2:
				if (coches.size() > 0) {
					Coche salir = coches.remove(0);
					System.out.println(salir);
				} else
					System.out.println("No hay coche en la cola");
				break;
			case 3:
				System.out.println(coches.toString());
				break;
			case 4:
				sc.nextLine();
				System.out.println("Anota matricula coche a buscar:");
			    matricula=sc.nextLine();
			    int pos=coches.indexOf(new Coche(matricula));//para comparar
			    //int pos=buscar(coches,matricula);
			    if(pos==-1)
			    	System.out.println("No encontrado");
			    else
			    	System.out.println("Encontrado en posicion: "+pos);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Anota matricula coche a buscar:");
			    matricula=sc.nextLine();
			    if(coches.remove(new Coche(matricula)))
			    	System.out.println("Coche borrado");
			    else
			    	System.out.println("No existe el coche");
				break;
			case 6:
				default: System.out.println("Opcion incorrecta");
			}
		} while (opc != 6);

	}
	public static int buscar(Vector <Coche> coches,String mat) {
		for(int i=0;i<coches.size();i++)
			if(coches.get(i).getMatricula().equalsIgnoreCase(mat)) {
				return i;
			}
		return -1;
	}
}
