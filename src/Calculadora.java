import java.util.Scanner;

/**
 * Esta clase representa una calculadora que realiza operaciones matemáticas básicas.
 */
public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    /**
     * Realiza la operación de suma entre dos números ingresados por el usuario.
     * @param v El primer número a sumar.
     * @param v1 El segundo número a sumar.
     * @return El resultado de la suma.
     */
    public double suma(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La suma es " + (num1+num2));

        return num1 + num2;
    }

    /**
     * Realiza la operación de resta entre dos números ingresados por el usuario.
     * @param v El primer número.
     * @param v1 El segundo número.
     * @return El resultado de la resta.
     */
    public double resta(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La resta es " + (num1-num2));

        return num1 - num2;
    }

    /**
     * Realiza la operación de multiplicación entre dos números ingresados por el usuario.
     * @param v El primer número a multiplicar.
     * @param v1 El segundo número a multiplicar.
     * @return El resultado de la multiplicación.
     */
    public double multiplicacion(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La multiplicacion es " + (num1*num2));

        return num1 * num2;
    }

    /**
     * Realiza la operación de división entre dos números ingresados por el usuario.
     * @param v El dividendo.
     * @param v1 El divisor.
     * @return El resultado de la división.
     */
    public double division(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN;
        }
        System.out.println("La division es " + (num1/num2));
        return num1 / num2;
    }
}
