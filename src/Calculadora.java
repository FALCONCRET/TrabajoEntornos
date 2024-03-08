import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public double suma(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La suma es " + (num1+num2));

        return num1 + num2;
    }

    public double resta(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La resta es " + (num1-num2));

        return num1 - num2;
    }

    public double multiplicacion(double v, double v1){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La multiplicacion es " + (num1*num2));

        return num1 * num2;
    }

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