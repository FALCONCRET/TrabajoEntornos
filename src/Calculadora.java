import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public void suma(){
        System.out.println("Introduce el primer numero CON  decimales usando ,");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero CON  decimales usando ,");
        double num2 = sc.nextDouble();
        System.out.println("La suma es " + (num1+num2));

    }
}