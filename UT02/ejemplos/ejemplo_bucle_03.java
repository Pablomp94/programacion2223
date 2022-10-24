/*
 * Boletín 03 - ejemplo_bucle_01.java
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
public class ejemplo_bucle_03 {

	public static void main (String[] args) {
		
		Scanner sc;		
		int numero_elegido=37 , numero_leido=0;
		sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero entre 0 y 50");
		numero_leido = sc.nextInt();
		while (numero_elegido!=numero_leido) {
			System.out.println("No acertaste");
			System.out.println("Escribelo otra vez");
			numero_leido = sc.nextInt();
		}
		
		
	
	}

}
