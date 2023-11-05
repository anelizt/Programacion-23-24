import java.util.Scanner;

public class DeclaracionesOperadores {

	public static void main(String[] args) {
		System.out.println("Hola usuario, introduce un número para saber su raiz cuadrada.");
		
		Scanner scanner=new Scanner(System.in);
		double numero =scanner.nextDouble();
		System.out.println(Math.sqrt(numero));
		System.out.println("Ahora te voy a enseñar el resultdo de tu número elevado a 2.");
		System.out.println(Math.pow(numero, 2));
		System.out.println("Ahora vamos a redondear un número, introduce el número que quieres redondear:");
		double redondeo=scanner.nextDouble();
		System.out.println("El número redondeado es: "+ Math.round(redondeo));
		scanner.close();
		
		

	}

}
