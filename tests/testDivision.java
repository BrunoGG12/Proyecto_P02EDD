import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testDivision {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void division() {
        double num1 = 100.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = Calculadora.Division(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void division1() {
        double num1 = 25.0;
        double num2 = 5.0;
        double expResult = 5.0;
        double result = Calculadora.Division(num1,num2);
        assertEquals(expResult,result);
    }
    @Test
    void division2() {
        double num1 = 80.0;
        double num2 = 8.0;
        double expResult = 10.0;
        double result = Calculadora.Division(num1,num2);
        assertEquals(expResult,result);
    }
}