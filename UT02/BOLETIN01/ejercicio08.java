/*
*
* Ejercicio 08 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio08 {	
	
	static public int num=0;
	
	public static void main (String[] args) {		
		
		
		boolean hayDieces=false;
		Scanner sc = new Scanner(System.in);				
		
		do {		
			System.out.println("Escribe un numero");	
			
			num = sc.nextInt();
			if (num>=0 && num<=10) {
				if (num==10) {				
					hayDieces = true;
				}
			}
			else {
				if (nota != -1) {
					System.out.println("Has escrito un valor no válido");
				}
			}
		} while ( num != -1) ;
		if (hayDieces) {
			System.out.println(sc.nextInt());
			System.out.println("Has escrito al menos un diez");	
		} else {
			System.out.println("No has escrito ningún diez");	
		}
	}
}


