import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		int figura=scanner.nextInt();
		switch (figura) {
			case 1: {
				System.out.println("Introduce el lado del cuadrado:");
				int lado=scanner.nextInt();
				System.out.println("El área del cuadrado con lado "+ lado+ " es: "+ Math.pow(lado, 2));	
				break;
				}
			case 2:{
				System.out.println("Introduce la base del rectángulo:");
				int base=scanner.nextInt();
				System.out.println("Introduce la altura del rectángulo:");
				int altura=scanner.nextInt();
				System.out.println("El área del rectángulo es: "+base*altura);
				break;
				}
			case 3:{
				System.out.println("Introduce la base del triángulo:");
				int base=scanner.nextInt();
				System.out.println("Introduce la altura del triángulo:");
				int altura=scanner.nextInt();
				System.out.println("El área del rectángulo es: "+(base*altura)/2);
				break;
				}
			case 4:{
				System.out.println("Introduce el rádio del círculo:");
				int radio=scanner.nextInt();
				System.out.print("El área del círculo es: ");
				System.out.printf("%1.2f", + Math.PI*(Math.pow(radio, 2)));
				break;
			}
			
		
		
		
		}
		scanner.close();

	}

}
