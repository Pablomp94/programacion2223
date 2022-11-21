/*
*
* Ejercicio 02 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio02 {	
	
	public static void main (String[] args) {		
		
		int num=0, mayor =0;
		Scanner sc = new Scanner(System.in);		
		
		for (int i=1; i<=10; i++) {
			num = sc.nextInt();
			if (num > mayor) {
				mayor = num;
			}
		}
		System.out.println("El numero mayor es " + mayor);	
	}
}


