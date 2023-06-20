package primer_Proyecto;

import java.util.Scanner;

public class area_Rectangulo {
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe el alto de tu rectangulo");
		float Alto = input.nextFloat();
		System.out.println("Escribe el ancho de tu rectangulo");
		float Ancho = input.nextFloat();
		double el_area_es = (Alto*Ancho);
		System.out.println("El area de tu Rectangulo es: " + el_area_es);
	}

}