import java.util.Scanner;

public class DivisibleEntreDos {

	public static void main(String[] args) {
		/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
		Si no lo es, también debemos indicarlo.*/
		
		System.out.println("Buenas usuario, introduce un número para saber si es sivisible entre 2.");
		Scanner scanner=new Scanner(System.in);
		double numero=scanner.nextDouble();
		
		if (numero%2==0) {
			System.out.println("El número es divisible entre 2.");
			
		}else{
			System.out.println("El número no es divisible entre 2.");
		}
		scanner.close();

	}

}
