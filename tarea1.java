package primer_Proyecto;

import java.util.Scanner;

public class tarea1 {
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe la temperatura en grados fahrenheit");
		float Grado = input.nextFloat();
		double es_igual = (Grado-32)/1.8;
		System.out.println("La temperatura en grados es: " + es_igual);
	}

}
