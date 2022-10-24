/*
 * Boletín 03 - ejemplo01.java
 * 
 * Copyright 18-10-2022 Joaquin Rios NRE:1234335
 * 
 * Este programa comprueba si eres mayor de edad
 * 
 * He usado dos variables: una para la edad y otra para el nombre
 * Me ha parecido facil.
 * 
 * TODO: pendiente la cpnversion de entero
 * 
 * 
 */

import java.util.Scanner;

public class ejemplo01 {
	
	public static void main (String[] args) {
		
		String frase, nombre_y_apellidos;
		int edad, mes, year;
		float promedio;		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		nombre_y_apellidos = sc.nextLine();
		System.out.println("Hola, " + nombre_y_apellidos);
		System.out.println("Escribe tu edad");
		edad = sc.nextInt();
		while (edad<10) {
			System.out.println("Eres muy joven");
			System.out.println("Escribe otra vez tu edad");
			edad = sc.nextInt();
		}
		while (edad>100) {
			System.out.println("Eres muy mayor");
			System.out.println("Escribe otra vez tu edad");
			edad = sc.nextInt();
		}
		
		if (edad>18) {
			System.out.println("Puedes ir al chino a por ron");
		}
		else {
			System.out.println("Te apetece ver un capitulo de peppa pig?");
		}
			
        
		
	}
}

