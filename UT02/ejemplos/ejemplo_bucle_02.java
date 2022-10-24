/*
 * Boletín 03 - ejemplo_bucle_01.java
 * 
 * Copyright 18-10-2022 Joaquin Rios NRE:1234335
 * 
 * Este programa crea la tabla de un numero dado
 * 
 * TODO: 
 * 
 * 
 */

import java.util.Scanner;
public class ejemplo_bucle_02 {

	public static void main (String[] args) {
		
		Scanner sc;		
		int numero_tabla , numero=0;
		sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero entre 0 y 20");
		numero_tabla = sc.nextInt();
		while (numero_tabla>20) {
			System.out.println("Numero muy alto");
			System.out.println("Escribelo otra vez");
			numero_tabla = sc.nextInt();
		}
		
		while (numero_tabla<0) {
			System.out.println("Numero muy bajo");
			System.out.println("Escribelo otra vez");
			numero_tabla = sc.nextInt();
		}
		
		System.out.println ("Tabla del " + numero_tabla);
		
		while (numero<=10) {
			int producto = numero_tabla * numero;
			System.out.println (numero_tabla + "x" + numero + "=" + producto);
			numero++;
			//numero=numero+1;
		}
	
	}

}
