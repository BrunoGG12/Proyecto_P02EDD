import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSuma {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void suma() {
        double num1 = 10.0;
        double num2 = 15.0;
        double expResult = 25.0;
        double result = Calculadora.suma(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void suma1() {
        double num1 = 100.0;
        double num2 = 70.0;
        double expResult = 170.0;
        double result = Calculadora.suma(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void suma2() {
        double num1 = 4.0;
        double num2 = 85.0;
        double expResult = 89.0;
        double result = Calculadora.suma(num1,num2);
        assertEquals(expResult,result);
    }
}