import java.util.Scanner;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número:");
		Scanner scanner=new Scanner(System.in);
		String num1=scanner.next();
		double num2=Double.parseDouble(num1);
		System.out.print("La raíz de "+num2+" es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		scanner.close();
	}

}
