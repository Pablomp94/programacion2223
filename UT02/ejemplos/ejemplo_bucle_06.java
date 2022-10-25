
import java.util.Scanner;
public class ejemplo_bucle_06 {

	public static void main(String[] args) {
		int cifras=1, num_leido , resto;
		Scanner sc = new Scanner(System.in);		
		
		do {		
			System.out.println("Introduce número mayor que cero");
			num_leido = sc.nextInt();
		} while (num_leido<1);
		
		resto = num_leido/10;
		while (resto>0) {
			System.out.println(resto);
			resto= resto/10;
		}
		
		
	}

}
