/*
 * ejemplo01.java
 * 
 * Copyright 2022 profesor <profesor@profesor-A27>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class ejemplo01 {
	
	public static void main (String[] args) {
		
		String cadena;
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		cadena = sc.nextLine();
		System.out.println("Hola, " + cadena);
		
		// entrada de un numero
        System.out.println("Escribe tu edad");
		numero = sc.nextInt();
		System.out.println("Tu edad es " + numero);
        
		
	}
}

