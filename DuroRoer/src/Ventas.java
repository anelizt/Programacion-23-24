import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		/*Realiza una aplicación que nos pida un número de ventas a introducir, 
		después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
		Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		System.out.println("Hola usuario, introduce cuantas ventas quieres sumar.");
		Scanner scanner=new Scanner(System.in);
		int ventas=scanner.nextInt();
		double valores;
		double suma=0;
		
		for(int i=1;ventas>=i;i++){
				System.out.println("Introduce la venta numero: "+i);
				valores=scanner.nextDouble();
				suma+=valores;
				
				
			if (ventas==i){
			
				System.out.println("Tus "+ ventas+ " ventas suman "+suma+" Euros.");
			}
				
			
			scanner.close();
			
			
			
		}
		
	}

}
