
import java.util.Scanner;
public class ejemplo_bucle_05 {

	public static void main(String[] args) {
		int suma=0,num_leido;
		Scanner sc = new Scanner(System.in);		
		
		do {		
			System.out.println("Introduce número (0 para salir)");
			num_leido = sc.nextInt();
			suma = suma + num_leido;
		} while (num_leido!=0);
		
		System.out.println("La suma es " + suma);
		
	}

}
