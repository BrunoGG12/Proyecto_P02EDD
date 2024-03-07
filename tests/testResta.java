import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testResta {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void resta() {
        double num1 = 15.0;
        double num2 = 10.0;
        double expResult = 5.0;
        double result = Calculadora.Resta(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void resta1() {
        double num1 = 100.0;
        double num2 = 13.0;
        double expResult = 87.0;
        double result = Calculadora.Resta(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void resta2() {
        double num1 = 56.0;
        double num2 = 6.0;
        double expResult = 50.0;
        double result = Calculadora.Resta(num1,num2);
        assertEquals(expResult,result);
    }

}