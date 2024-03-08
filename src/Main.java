import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        String opcion;
        do {//utlizamos el do while para obligar al usuario a elegir el color para jugar.
            System.out.println("Selecciona un operacion:");
            System.out.println("1.Sumar :");
            System.out.println("2.Restar :");
            System.out.println("3.Multiplicar :");
            System.out.println("4.Dividir :");
            System.out.println("0.Salir :");
            opcion = sc.nextLine();
            switch (opcion) {//utilizamos el switch para los casos que tenemos para la eleccion del turno.
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
                    System.out.println("Hasta luego!!");

                    break;
                default:
                    System.out.println("Opcion no valida, inserta un numero asocido a una opcion :");
                    break;
            }
        } while (!opcion.equals("0"));
    }
}
