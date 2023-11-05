import java.util.Scanner;

public class AsciACaracter {

	public static void main(String[] args) {
		//pida un carácter (char) y muestre su código en la tabla ASCII.
		
		System.out.println("Introduce un carácter y te diré su código numérico de la tabla ASCII.");
		Scanner scanner=new Scanner(System.in);
		String simbolo=scanner.next();
		char ch=simbolo.charAt(0);
		int charToAscii = ch;
		System.out.println("El código al que pertenece tu símbolo "+simbolo+ " es: "+charToAscii);
		scanner.close();

	}

}
