import java.util.Scanner;

public class CuantasCifrasNumero {

	public static void main(String[] args) {
		/*Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el 
		número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. 
		Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.*/
		
		Scanner scanner=new Scanner(System.in);
		long numero;
		do {
		System.out.println("Introduce un número entero positivo:");
		numero=scanner.nextLong();
		int digitos=(int)Math.log10(numero)+1;
		//System.out.println(digitos);
		System.out.println("El número "+numero+" tiene "+ digitos+ " cifras.");
		
		}while(numero<0);
		scanner.close();

	}

}
