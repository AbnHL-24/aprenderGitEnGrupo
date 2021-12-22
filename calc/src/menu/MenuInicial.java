package menu;

import java.util.Scanner;

/**
 * Clase MenuInicial contiene el menu principal de la calculadora.
 * @author AbnHL-24
 */
public class MenuInicial {
    Scanner sc = new Scanner(System.in);

    /**
     * Metodo del menú inicial.
     */
    public void iniciarMenu() {
        double operacion;

        do {
        System.out.println("Bienbenido a KalcTerminal");
        System.out.println("Por favor ingresa el numero de la operacion que deseas realizar:");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. Division\n5. Potenciación\n6. Salir");
        operacion = leerEntrada();
        } while (operacion != 6);

    }

    /**
     * Metodo que retorna un valor de la terminal como double.
     * @return el valor de la entrada en la terminal.
     */
    private double leerEntrada() {
        return sc.nextDouble();
    }
}
