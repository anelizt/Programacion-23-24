import java.util.Scanner;

public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave="Carol";
		String pass="";
		Scanner scanner=new Scanner(System.in);
		
		while(clave.equals(pass)==false){
			System.out.println("Por favor, introduce la contraseña:");
			pass=scanner.next();
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta.");
				
			}
			
		}
		System.out.println("Contraseña correcta. Acesso permitido.");
		scanner.close();
	}

}
