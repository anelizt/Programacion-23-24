package temauno;

import java.util.Scanner;

public class AreaPerimetro {

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que permite calcular el área y el perímetro de un
		 * círculo, cuadrado, rectángulo y triángulo. El usuario puede elegir qué figura
		 * quiere e introducir los valores necesarios para que se muestren los
		 * resultados. La aplicación termina cuando el usuario lo indique.
		 */

		int eleccionUsuario;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Buenos dias usuario, con este programa puedes calcular el área y el perimetro de "
				+ "las siguientes figuras geometricas.\nElige la que quieras y pulsa 5 cuando quieras terminar.\"");

		do {
			System.out.println("\n1 Círculo \n2 Cuadrado \n3 Rectángulo \n4 Triángulo \n5 Salir del programa.");
			do {
				eleccionUsuario = scanner.nextInt();
				if (eleccionUsuario <= 0 || eleccionUsuario > 5)
					System.out.println("Introduce una opción válida.");

				switch (eleccionUsuario) {
				case 1:
					System.out.println("Has elegido el círculo, necesito que introduzcas el rádio:");
					double radio = scanner.nextDouble();
					double areaCirculo = Math.PI * (Math.pow(radio, 2));
					double perimetroCirculo = 2 * Math.PI * radio;
					System.out.println("El área del círculo es: " + String.format("%1.2f", areaCirculo)
							+ "\nEl perímetro del círculo es: " + String.format("%1.2f", perimetroCirculo));
					break;
				case 2:
					System.out.println("Has elegido el cuadrado, necesito que introduzcas el lado:");
					double lado = scanner.nextDouble();
					double areaCuadrado = Math.pow(lado, 2);
					double perimetroCuadrado = 4 * lado;
					System.out.println("El área del cuadrado es: " + String.format("%1.2f", areaCuadrado)
							+ "\nEl perímetro del cuadrado es: " + String.format("%1.2f", perimetroCuadrado));
					break;

				case 3:
					System.out.println("Has elegido el rectángulo, necesito que introduzcas los lados: \nLado a:");
					double ladoA = scanner.nextDouble();
					System.out.println("Lado b:");
					double ladoB = scanner.nextDouble();
					double areaRectangulo = ladoA * ladoB;
					double perimetroRectangulo = 2 * (ladoA + ladoB);
					System.out.println("El área del rectángulo es: " + String.format("%1.2f", areaRectangulo)
							+ "\nEl perímetro del rectángulo es: " + String.format("%1.2f", perimetroRectangulo));
					break;
				case 4:
					System.out.println(
							"Has elegido el triángulo, necesito que introduzcas dos valores para el área. \nIntroduce la base:");
					double base = scanner.nextDouble();
					System.out.println("Introduce la altura:");
					double altura = scanner.nextDouble();
					double areaTriangulo = (base * altura) / 2;
					System.out.println(
							"Para calcular el perímetro del triángulo necesito sus tres lados:\nIntroduce Lado 1 ");
					double ladoUno = scanner.nextDouble();
					System.out.println("Introduce Lado 2:");
					double ladoDos = scanner.nextDouble();
					System.out.println("Introduce Lado 3:");
					double ladoTRes = scanner.nextDouble();
					double perimetroTriangulo = ladoUno + ladoDos + ladoTRes;
					System.out.println("El área del triángulo es: " + String.format("%1.2f", areaTriangulo)
							+ "\nEl perímetro del triángulo es: " + String.format("%1.2f", perimetroTriangulo));
					break;
				}

			} while (eleccionUsuario < 0 || eleccionUsuario > 5);

		} while (eleccionUsuario < 5);

		System.out.println("Hasta luego usuario.");
		System.out.println("Prueba");

		scanner.close();

	}

}
