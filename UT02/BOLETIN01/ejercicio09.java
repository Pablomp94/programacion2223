
import java.util.Scanner;


public class ejercicio09 {	
	
	public static void main (String[] args) {	
	
		int sumaPares=0, sumaImpares=0;
		
		for (int i=100;i<201;i++) {
			if (i%2==0) {
				sumaPares=sumaPares+i;
			}
			else {
				sumaImpares=sumaImpares+i;
			}
			//System.out.println(i);
		}
		System.out.println("La suma de los pares es " + sumaPares);
		System.out.println("La suma de los impares es " + sumaImpares);
	}
}
