/**
 * @author Bruno Gil
 *
 */
public class Division {
    double num1;
    double num2;
    /**
     * @param num1 recibe un numero por parametro para poder realizar la operacion
     * @param num2 recibe un numero por parametro para poder realizar la operacion
     * @return devuelve la division de los dos param
     */
    public static double division(double num1,double num2){
        if(num2==0){
            return 0;
        } else {
            return num1/num2;
        }
    }
}
