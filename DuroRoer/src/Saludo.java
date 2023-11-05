import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		/*Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. 
		Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».*/
		
		String nombre;
		System.out.println("¿Cómo te llamas?");
		Scanner scanner=new Scanner(System.in);
		nombre=scanner.next();
		System.out.println("Bienvenido "+nombre+".");
		scanner.close();
		

	}

}
