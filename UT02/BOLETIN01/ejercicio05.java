/*
*
* Ejercicio 05 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio05 {	
	
	public static void main (String[] args) {		
		
		int num=0;
		boolean hayNegativos=false;
		
		for (int i=1; i<=10; i++) {			
			System.out.println("Escribe un numero");	
			Scanner sc = new Scanner(System.in);		
			num = sc.nextInt();
			if (num<0) {				
				hayNegativos = true;
			}
		}
		if (hayNegativos) {
			System.out.println("Has escrito al menos un numero negativo");	
		}
	}
}


