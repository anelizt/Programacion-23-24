import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		System.out.println("Introduce tu edad, por favor");
		Scanner scanner=new Scanner(System.in);
		int edad=scanner.nextInt();
		
		if (edad<18) {
			System.out.println("Eres un adolescente.");
			
		}else if (edad<40) {
			System.out.println("Eres joven.");
			
		}else if (edad<65) {
			System.out.println("Eres maduro.");
			
		}else {
			System.out.println("Cuídate.");
		}
		
		
		scanner.close();

	}

}
