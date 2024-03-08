import java.util.Scanner;

/**
 * Esta clase contiene el método principal que permite al usuario realizar operaciones con una calculadora.
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    /**
     * El método principal que interactúa con el usuario para realizar operaciones con una calculadora.
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        String opcion;
        do {
            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar :");
            System.out.println("2. Restar :");
            System.out.println("3. Multiplicar :");
            System.out.println("4. Dividir :");
            System.out.println("0. Salir :");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    Calculadora sumaC = new Calculadora();
                    sumaC.suma(2.0, 3.0);
                    break;
                case "2":
                    Calculadora restaC = new Calculadora();
                    restaC.resta(2.0, 3.0);
                    break;
                case "3":
                    Calculadora multipC = new Calculadora();
                    multipC.multiplicacion(2.0, 3.0);
                    break;
                case "4":
                    Calculadora divisionc = new Calculadora();
                    divisionc.division(6.0, 3.0);
                    break;
                case "0":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, inserta un número asociado a una opción :");
                    break;
            }
        } while (!opcion.equals("0"));
    }
}