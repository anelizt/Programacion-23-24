import java.util.Scanner;

public class AdivinaContraseñaTresIntentos {

	public static void main(String[] args) {
		/*Escribe una aplicación con un String que contenga una contraseña cualquiera. 
		Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá 
		mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 
		Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
		
		String contraseña="Carol";
		int intentos=3;
		Scanner scanner=new Scanner(System.in);
		String entradaUsuario="";
		do{
			System.out.println("Introduce la contraseña para poder continuar, tienes " +intentos+ " intentos:");
			entradaUsuario=scanner.next();
			intentos--;
			if(entradaUsuario.equals(contraseña)){
				System.out.println("Contreña correcta.");
			}else {
				System.out.println("Contraseña incorrecta.");
			}
		}while(intentos>0&&!entradaUsuario.equals(contraseña));
		if(intentos<1) {
			System.out.println("Se acabaron los intentos.");
		}
		scanner.close();
		
	}

}
