public class ejemplo2 {

	public static void main (String[] args) {
		
		int numero_tabla = 9 , numero=0;
		
		System.out.println ("Tabla del " + numero_tabla);
		
		while (numero<=10) {
			int producto = numero_tabla * numero;
			System.out.println (numero_tabla + "x" + numero + "=" + producto);
			//Es lo mismo que poner numero++
			numero=numero+1;
		}
	
	}

}
