import java.util.Scanner;

public class CaracterAAsci {

	public static void main(String[] args) {
		/*Lee un número por teclado y muestra por consola, el carácter al que pertenece 
		 * en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
		 */
		System.out.println("Introducde un número y te diré cual es su carácter en la table ASCII.");
		Scanner scanner=new Scanner(System.in);
		int numero=scanner.nextInt();
		char ch=(char)numero;
		System.out.println("El número "+numero+" en la tabla ASCII es: "+ ch);
		scanner.close();
		



	}

}
