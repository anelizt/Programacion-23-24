import java.util.Scanner;

public class PrecioIva {

	public static void main(String[] args) {
		/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
		y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/
		
		double pva;
		final double IVA=0.21;
		System.out.println("Introduce el precio de albarán del producto y te diremos el precio con IVA.");
		Scanner scanner=new Scanner(System.in);
		pva=scanner.nextDouble();
		System.out.println("El precio del producto es: "+((pva*IVA)+pva) +" Euros");
		scanner.close();

	}

}
