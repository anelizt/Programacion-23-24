import java.util.Scanner;

public class DiasLaborables {

	public static void main(String[] args) {
		/*Crea una aplicación que nos pida un día de la semana 
		y que nos diga si es un dia laboral o no. Usa un switch para ello.*/
		System.out.println("Introduce un día de la semana y te diré si es laborable o no.");
		Scanner scanner=new Scanner(System.in);
		String dia=scanner.next();
		switch (dia.toUpperCase()) {
			case "LUNES":
			case "MARTES":
			case "MIERCOLES":
			case "JUEVES":
			case "VIERNES":
				System.out.println("Es laborable.");
				break;
			case "SABADO":
			case "DOMINGO":
				System.out.println("No es laborable.");
			default:
				System.out.println("Introduce un día de la semana:");
		}
		
		scanner.close();

	}

}
