import java.util.Scanner;

public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce tu nombre.");
		Scanner scanner=new Scanner(System.in);
		String nombre=scanner.nextLine();
		//String nombre="Carolina";
		System.out.println("Tu nombre es: "+ nombre);
		System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
		System.out.println("La primera letra del nombre es: "+nombre.charAt(0)+".");
		System.out.println("La segunda letra de tu nombre es: "+ nombre.charAt(1)+".");
		int ultimaLetra=nombre.length()-1;
		System.out.println("La última letra de tu nombre es: "+nombre.charAt(ultimaLetra)+".");
		scanner.close();
	}

}