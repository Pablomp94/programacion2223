
import java.util.Scanner;
public class ejemplo_bucle_04 {

	public static void main(String[] args) {
		int numero , contador=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entre 0 y 100");
		numero = sc.nextInt();
		while (numero>100) {
			System.out.println("Numero muy alto");
			System.out.println("Escribelo otra vez");
			numero = sc.nextInt();
		}
		
		while (numero<0) {
			System.out.println("Numero muy bajo");
			System.out.println("Escribelo otra vez");
			numero = sc.nextInt();
		}
		
		
		while (contador<=numero) {						
			if (contador%2==0) {
				System.out.println(contador);
			}
			contador++;
		}
	}

}
