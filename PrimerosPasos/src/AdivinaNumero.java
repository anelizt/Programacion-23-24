import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		double aleatorio=Math.random()*100;
		int aleatorioint=((int)aleatorio); 
		System.out.println(aleatorioint);
		Scanner scanner=new Scanner(System.in);
		int intentos=0;
		int numero=0;
		
		while (numero!=aleatorioint) {
			System.out.println("Introduce un número, a ver si aciertas.");
			numero=scanner.nextInt();
			if (numero<aleatorioint) {
			System.out.println("El número es mayor.");
			
			}else if(numero>aleatorioint){
				System.out.println("El número es menor.");
				
			}
			intentos++;
			}
			System.out.println("Correcto, lo has conseguido en "+intentos+" intentos.");
			scanner.close();
		}	
		
	}


