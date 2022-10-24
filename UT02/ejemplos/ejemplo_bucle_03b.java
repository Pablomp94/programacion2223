/*
 * Boletín 03 - ejemplo_bucle_03.java
 * 
 * Copyright 18-10-2022 Joaquin Rios NRE:1234335
 * 
 * Este programa juega a adivinar el numero
 * 
 * TODO: 
 * 
 * 
 */

import java.util.Scanner;
public class ejemplo_bucle_03b {

	public static void main (String[] args) {
		
		Scanner sc;		
		int numero_elegido=37 , numero_leido=0, intentos=1, terminado=0;
		sc = new Scanner(System.in);

		
		System.out.println("Escribe un numero entre 0 y 50");
		numero_leido = sc.nextInt();
		while (terminado==0) {
			//Numero fuera de rango
			intentos++;
			if (numero_leido>50 || numero_leido<0) {
				System.out.println("Número fuera de rango");
			}
			else { //El numero esta dentro del rango
				if (numero_leido<numero_elegido) {
					System.out.println("Prueba un número mayor");
				}
				
				if (numero_leido>numero_elegido) {
					System.out.println("Prueba un número menor");
				}
			}
			
			if (intentos>10) terminado = 1;
			if (numero_leido== numero_elegido) terminado = 1;
			System.out.println("Escribelo otra vez");
			numero_leido = sc.nextInt();
		}
		if (numero_elegido==numero_leido) {
			System.out.println("¡¡ ACERTASTE EN " + intentos + " INTENTOS !!!");
		}
		else {
			System.out.println("Has agotado tus intentos");
		}
	}

}
