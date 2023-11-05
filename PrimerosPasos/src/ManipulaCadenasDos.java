import java.util.Scanner;

public class ManipulaCadenasDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce la frase que quieres analizar.");
		String frase= scanner.nextLine();
		System.out.println("La subcadena que extraigo desde la cuarta letra "
				+ "hasta la sexta es: "+frase.substring(3, 5));
				*/
		String contraseña="hola";
		System.out.println("Buenas usuario, introduce la contraseña: ");
		Scanner scanner=new Scanner(System.in);
		String entradaUsuario=scanner.nextLine();
		//System.out.println(contraseña.equalsIgnoreCase(entradaUsuario));
		if (contraseña.equalsIgnoreCase(entradaUsuario)) {
			System.out.println("La contraseña es correcta.");
			
		}else {
			System.out.println("La contraseña NO es correcta.");
		}
		
		scanner.close();
		
		

	}

}
