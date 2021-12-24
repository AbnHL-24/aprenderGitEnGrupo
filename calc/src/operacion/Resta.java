package operacion;

import menu.MenuInicial;
import java.util.Scanner;

public class Resta{
	int resultado;
	Scanner teclado = new Scanner(System.in);

	

	public void iniciarOperacion(){
		System.out.println("Ingrese el primer numero");
		int num1 = teclado.nextInt();
		System.out.println("El primer numero es:" +  num1);
		System.out.println("Ingrese el segundo numero");
		int num2 = teclado.nextInt();

		resultado = operacion(num1, num2);
		mostrarResultado(resultado);
	}



	public int operacion(int num1, int num2){
		resultado = num1 - num2;
		return resultado;

	}

	public void mostrarResultado(int resultado){
		System.out.println("el resultado de la operacion es: " + resultado);
		teclado.nextLine();
	}
}