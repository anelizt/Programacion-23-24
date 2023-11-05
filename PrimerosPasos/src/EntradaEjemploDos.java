import javax.swing.*;

public class EntradaEjemploDos {

	public static void main(String[] args) {
		String nombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad=JOptionPane.showInputDialog("Introduce tu edad.");
		int edadUsuario=Integer.parseInt(edad);
		edadUsuario++;
		System.out.println("Hola "+ nombreUsuario+ " ,tienes "+ edad+" años."+" El año que viene tendrás "
		+(edadUsuario)+".");
		
		
		

	}

}
