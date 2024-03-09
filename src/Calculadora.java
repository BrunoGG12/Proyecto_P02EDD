/**
 * @author Bruno Gil
 *
 */
import java.util.Scanner;
//import java.util.logging.Logger;

public class Calculadora {
    private static final String OPERADOR1 =  "Introduce primer operador: ";//Constante que se muestra por pantalla para que el usuario introduzca un numero
    private static final String OPERADOR2 =  "Introduce segundo operador: ";//Constante que se muestra por pantalla para que el usuario introduzca un numero

    static Scanner sc = new Scanner(System.in);
    //static Logger logger = Logger.getLogger(Calculadora.class.getName());

    public static void main(String[] args) {
        String opcion;
        double num1;
        double num2;
        do{//Menu que se va a mostrar mientras que el usuario no introduzca un 0
            System.out.println("La calculadora tiene la siguientes opciones: ");
            //logger.info("La calculadora tiene la siguientes opciones: ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("¿Que opción quieres realizar?");
            opcion = sc.nextLine();//Recibe la "opcion" del usuario apara seleccionar el tipo de operacion

            switch(opcion){//Segun la eleccion del usuario entrara por un case u otro
                case "1"://Suma
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(suma(num1,num2));//Muestra el resultado
                    break;
                case "2"://Resta
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(resta(num1,num2));//Muestra el resultado
                    break;
                case "3"://Multiplicacion
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(multiplicacion(num1,num2));//Muestra el resultado
                    break;
                case "4"://Division
                    System.out.println(OPERADOR1);
                    num1 = sc.nextDouble();
                    System.out.println(OPERADOR2);
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(division(num1,num2));//Muestra el resultado
                    break;
                case "0":
                    System.out.println("Terminamos");//Mensaje de despedida
                    break;
                default://Si el usuario introduce un numero que no esta entre 0 y 4 mostrara el siguiente mensaje
                    System.out.println("Opción no válida");
            }
        }while(!opcion.equals("0"));//Mientras que el usuario no introduzca un 0 seguira funcionando el bucle
    }

    public static double suma(double num1,double num2){//Metodo que llama a la clase Suma y devuelve el resultado
        return Suma.suma(num1,num2);
    }
    public static double resta(double num1,double num2){//Metodo que llama a la clase Resta y devuelve el resultado
        return Resta.resta(num1,num2);
    }
    public static double multiplicacion(double num1,double num2){//Metodo que llama a la clase Multiplicacion y devuelve el resultado
        return Multiplicacion.multiplicacion(num1,num2);
    }
    public static double division(double num1,double num2){//Metodo que llama a la clase Division y devuelve el resultado
        return Division.division(num1,num2);
    }
}
