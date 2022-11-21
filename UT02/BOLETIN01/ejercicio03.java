/*
*
* Ejercicio 02 Bucles
*
*
*/

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {

		int num = 0, suma = 0;
		System.out.println("Escribe un numero");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			suma = suma + i;
		}
		System.out.println("La suma de 1 hasta " + num + " es " + suma);
	}
}
