import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMultiplicacion {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void multiplicacion() {
        double num1 = 10.0;
        double num2 = 10.0;
        double expResult = 100.0;
        double result = Calculadora.multiplicacion(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void multiplicacion1() {
        double num1 = 7.0;
        double num2 = 9.0;
        double expResult = 63.0;
        double result = Calculadora.multiplicacion(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void multiplicacion2() {
        double num1 = 24.0;
        double num2 = 3.0;
        double expResult = 72.0;
        double result = Calculadora.multiplicacion(num1,num2);
        assertEquals(expResult,result);
    }
}