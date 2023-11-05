import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		int sexo;
		int altura;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Buenos dias usuario, vamos a averiguar cuál es tu peso ideal.");
			System.out.println("Elige tu sexo: \n1 Mujer \n2 Hombre");
			sexo=scanner.nextInt();
			if(sexo==1) {
				System.out.println("Introduce tu altura en cm.");
				altura=scanner.nextInt();
				System.out.println("Tu peso ideal es: "+ (altura-120)+" Kg.");
			}else if(sexo==2) {
				System.out.println("Introduce tu altura en cm.");
				altura=scanner.nextInt();
				System.out.println("Tu peso ideal es: "+(altura-110)+" Kg.");
			}
			
		
		} while (sexo!=1&&sexo!=2);
		scanner.close();

	}

}
