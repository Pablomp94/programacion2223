/*
*
* Ejercicio 08 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio08_media {	
	
	public static void main (String[] args) {		
		
		int num=0, sumaNotas=0, cantidadNotas=0;
		Scanner sc = new Scanner(System.in);				
		
		do {		
			System.out.println("Escribe un numero");	
			
			num = sc.nextInt();
			if (num>=0 && num<=10) {
				sumaNotas = sumaNotas + num;
				cantidadNotas++;
			}
			else {
				if (num == -1) {
					System.out.println("Has elegido salir");
				} 
				else {
					System.out.println("Has escrito un valor no válido");					
				}
			}
		} while ( num != -1) ;

		int media = sumaNotas/cantidadNotas;
		System.out.println (" La media es " +  media);
	}
}


