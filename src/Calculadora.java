import java.util.Scanner;
//import java.util.logging.Logger;

public class Calculadora {
    private static final String OPERADOR1 =  "Introduce primer operador: ";
    private static final String OPERADOR2 =  "Introduce segundo operador: ";

    static Scanner sc = new Scanner(System.in);
    //static Logger logger = Logger.getLogger(Calculadora.class.getName());

    public static void main(String[] args) {
        String opcion;
        double num1;
        double num2;
        do{
            System.out.println("La calculadora tiene la siguientes opciones: ");
            //logger.info("La calculadora tiene la siguientes opciones: ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("¿Que opción quieres realizar?");
            opcion = sc.nextLine();

            switch(opcion){
                case "1":
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(suma(num1,num2));
                    break;
                case "2":
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(resta(num1,num2));
                    break;
                case "3":
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(multiplicacion(num1,num2));
                    break;
                case "4":
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(division(num1,num2));
                    break;
                case "0":
                    System.out.println("Terminamos");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(!opcion.equals("0"));
    }

    public static double suma(double num1,double num2){
        return Suma.suma(num1,num2);
    }
    public static double resta(double num1,double num2){
        return Resta.resta(num1,num2);
    }
    public static double multiplicacion(double num1,double num2){
        return Multiplicacion.multiplicacion(num1,num2);
    }
    public static double division(double num1,double num2){
        return Division.division(num1,num2);
    }
}
