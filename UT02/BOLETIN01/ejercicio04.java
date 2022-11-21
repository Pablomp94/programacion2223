/*
*
* Ejercicio 02 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio04 {	
	
	public static void main (String[] args) {		
		
		int num=0, factorial=1;
		System.out.println("Escribe un numero");	
		Scanner sc = new Scanner(System.in);		
		num = sc.nextInt();
		for (int i=1; i<=num; i++) {			
			factorial = factorial * i;
		}
		System.out.println("El factorial de  " + num + " es " + factorial);	
	}
}


