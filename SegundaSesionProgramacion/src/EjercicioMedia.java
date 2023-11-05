import java.util.Scanner;

public class EjercicioMedia {

	public static void main(String[] args) {
		/*Pedir el nombre y tres notas por teclado al usuario para poder mostrar la media. 

		Tenéis que hacer el ejercicio con números enteros y con decimales.

		El mensaje que debe mostrar tiene que ser: Bienvenido .......: tu nota es......*/
		
		String nombre;
		double notaUno, notaDos, notaTres, notaMedia;
		String notaMediaRedondeada;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Buenas usuario, ¿Cómo te llamas?");
		nombre=scanner.next();
		System.out.println("Si quieres saber tu nota media, debes introducir tus notas, tu primera nota es: ");
		notaUno=scanner.nextDouble();
		System.out.println("Tu segunda nota es: ");
		notaDos=scanner.nextDouble();
		System.out.println("Tu tercera nota es ");
		notaTres=scanner.nextDouble();
		notaMedia=((notaUno+notaDos+notaTres)/3);
		notaMediaRedondeada=String.format("%1.2f", notaMedia);
		System.out.println("Bienvenido/a "+ nombre+ ". Tu nota media es: " + notaMediaRedondeada);
		scanner.close();
		 

	}

}
