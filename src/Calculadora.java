import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public void suma(){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La suma es " + (num1+num2));

    }

    public void resta(){
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("La resta es " + (num1-num2));

    }

    public void multiplicacion(){
        System.out.println("Introduce el primer numero CON  decimales usando ,");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero CON  decimales usando ,");
        double num2 = sc.nextDouble();
        System.out.println("La multiplicacion es " + (num1*num2));

    }
}
