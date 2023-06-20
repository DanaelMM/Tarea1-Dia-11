package primer_Proyecto;

import java.util.Scanner;

public class area_Circulo {
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe el radio de tu circulo");
		float Radio = input.nextFloat();
		double el_area_es = 3.1416*(Radio*Radio);
		System.out.println("El area de tu Circulo es: " + el_area_es);
	}

}