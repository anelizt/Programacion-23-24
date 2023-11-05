import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		/*realiza un programa que te de un número aleatorio entre 0 y 100 y te pida por consola 
		 * que lo adivines. 
		 */
		
		int aleatorio=(int)(Math.random()*100);
		//System.out.println(aleatorio);
		Scanner scanner=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		do {
			System.out.println("A ver si aciertas el número.");
			numero=scanner.nextInt();
			if (numero<aleatorio) {
				System.out.println("El número es mayor.");
				
			}else if(numero>aleatorio){
				System.out.println("El número es menor.");
			}
			intentos++;
			
		} while (numero!=aleatorio);
		System.out.println("Por fin has acertado en "+ intentos+" intentos.");
		scanner.close();

	}

}
