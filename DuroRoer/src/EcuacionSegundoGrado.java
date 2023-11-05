import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		/*Realiza una aplicación que nos calcule una ecuación de segundo grado. 
		Debes pedir las variables a, b y c por teclado y comprobar antes que el 
		discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el 
		método sqlrt de Math. Te recomiendo que uses mensajes de traza.*/
		
		System.out.println("Programa para realizar raices cuadradas, introduce las variables: ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introdue la variable a:");
		double a=scanner.nextDouble();
		System.out.println("Introduce la variable b:");
		double b=scanner.nextDouble();
		System.out.println("Introduce la variable c:");
		double c=scanner.nextDouble();
		double dentroRaiz=(Math.pow(b, 2)-4*a*c);
		//System.out.println(dentroRaiz);
		double raiz=Math.sqrt(dentroRaiz);
		//System.out.println(raiz);
		double resultadoUno=(-b+raiz)/(2*a);
		double resultadodos=(-b-raiz)/(2*a);
		System.out.println("El resultado de la ecuacion es: \n1 Resultado 1 "+resultadoUno+"\n2 Resultado 2 "+resultadodos);
		scanner.close();
		

	}

}
