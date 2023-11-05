import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		/*Haz una aplicación que calcule el área de un círculo(pi*R2). 
		El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
		Usa la constante PI y el método pow de Math.*/
		
		System.out.println("Buenos dias usuario, esta es una aplicación para calcular el área de un círculo. "
				+ "Introduce el radio del círculo del que deseas calcular el área.");
		Scanner scanner=new Scanner(System.in);
		double radio=scanner.nextDouble();
		System.out.println("El área del círculo con radio "+radio+" es: "+Math.PI*(Math.pow(radio, 2)));
		
		scanner.close();



	}

}
