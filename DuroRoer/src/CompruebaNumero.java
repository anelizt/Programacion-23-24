import java.util.Scanner;

public class CompruebaNumero {

	public static void main(String[] args) {
		/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
		si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/
		
		double numero;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número.");
			numero=scanner.nextDouble();	
		} while (numero<0); 
		
		System.out.println("El número introducido es: "+numero);
		scanner.close();

	}

}
