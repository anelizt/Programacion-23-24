import java.util.Scanner;

public class MayorQue {

	public static void main(String[] args) {
		/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
		Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.*/
		
		System.out.println("Buenos días usuario, introduce dos números y te diré cual es mayor.");
		System.out.println("Introduce el primer número: ");
		Scanner scanner=new Scanner(System.in);
		double numeroUno=scanner.nextDouble();
		System.out.println("Ahora introduce el segundo número: ");
		double numeroDos=scanner.nextDouble();
		if (numeroUno>numeroDos) {
			System.out.println("El número mayor es el "+numeroUno);
			
		}else if (numeroDos>numeroUno) {
			System.out.println("El número mayor es el "+numeroDos);
			
		}else {
			System.out.println("Los números son iguales.");
		}
		scanner.close();
		
	}

}
