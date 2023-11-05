import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args) {
		/*Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
		resta, multiplicación, división y módulo (resto de la división)*/
		
		double numeroUno, numeroDos;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Usuario, introduce la primera cifra:");
		numeroUno=scanner.nextDouble();
		System.out.println("Usuario, introduce la segunda cifra:");
		numeroDos=scanner.nextDouble();
		System.out.println("Ahora que tengo las dos cifras te voy a mostrar:");
		System.out.println("La suma de las dos cifras: "+ (numeroUno+numeroDos));
		System.out.println("La resta de las dos cifras es: "+(numeroUno-numeroDos));
		System.out.println("La multiplicación de las dos cifras es: "+(numeroUno*numeroDos));
		System.out.println("La división de las dos cifras es: "+(numeroUno/numeroDos));
		System.out.println("El módulo de las dos cifras es: "+(numeroUno%numeroDos));
		System.out.println("Ahora te voy a dar los resultados redondeados.");
		double suma=numeroUno+numeroDos;
		double resta=numeroUno-numeroDos;
		double multiplicacion=numeroUno*numeroDos;
		double division=numeroUno/numeroDos;
		double modulo=numeroUno%numeroDos;
		String sumaRed=String.format("%1.2f", suma);
		String restaRed=String.format("%1.2f", resta);
		String multiplicacionRed=String.format("%1.2f", multiplicacion);
		String divisionRed=String.format("%1.2f", division);
		String moduloRed=String.format("%1.2f", modulo);
		System.out.println("El resultado redondeado de la suma es: "+sumaRed);
		System.out.println("El resultado redondeado de la resta es: "+restaRed);
		System.out.println("El resultado redondeado de la multiplicación es: "+ multiplicacionRed);
		System.out.println("El resultado redondeado de la división es: "+ divisionRed);
		System.out.println("El resultado redondeado del módulo es: "+ moduloRed);
		
		
		scanner.close();
	
}
}
