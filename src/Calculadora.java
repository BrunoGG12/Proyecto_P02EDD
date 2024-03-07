import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        double num1;
        double num2;
        do{
            System.out.println("La calculadora tiene la siguientes opciones: ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("¿Que opción quieres realizar?");
            opcion = sc.nextLine();

            switch(opcion){
                case "1":
                    System.out.println("Introduce primer operador: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo operador: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(Suma.suma(num1,num2));
                    break;
                case "2":
                    System.out.println("Introduce primer operador: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo operador: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(Resta.resta(num1,num2));
                    break;
                case "3":
                    System.out.println("Introduce primer operador: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo operador: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(Multiplicacion.multiplicacion(num1,num2));
                    break;
                case "4":
                    System.out.println("Introduce primer operador: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo operador: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(Division.division(num1,num2));
                    break;
                case "0":
                    System.out.println("Terminamos");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(!opcion.equals("0"));
    }
}
