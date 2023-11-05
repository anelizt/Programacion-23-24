import java.util.Scanner;

public class EntradaEjemploUno {

	public static void main(String[] args) {
		System.out.println("Introduce nombre, por favor.");
		Scanner scanner=new Scanner(System.in);
		String nombre=scanner.nextLine();
		System.out.println("Introduce tu edad.");
		int edad=scanner.nextInt();
		System.out.println("Hola, "+nombre+" tienes "+edad+" años.");
		scanner.close();
		
		

	}

}
