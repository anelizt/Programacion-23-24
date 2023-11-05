import java.util.Scanner;

public class DiezNumerosAleatorios {

	public static void main(String[] args) {
		/*Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
		Usa el método Math.random para generar un número entero aleatorio (recuerda el 
		casting de double a int).*/
		
		System.out.println("Introduce dos números:");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el primero número.");
		int numeroUno=scanner.nextInt();
		System.out.println("Introduce el seguno número.");
		int numeroDos=scanner.nextInt();
		//int contador=0;
				
		for(int i=0;i<10;i++) {
			int numeroAletorio=(int)Math.floor(Math.random()*(numeroUno-numeroDos)+numeroDos);
			//if(numeroAletorio>numeroUno&&numeroAletorio<numeroDos){
				System.out.println(numeroAletorio);
				//contador++;
				
			}
		scanner.close();
			
			
	//}

	}

}
