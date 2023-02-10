package trecos.exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSum() {
        System.out.println("sum");
        int n1 = 2;
        int n2 = 2;
        int expResult = 4;
        int result = Calculator.sum(n1, n2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSub() {
        System.out.println("sub");
        int n1 = 2;
        int n2 = 2;
        int expResult = 0;
        int result = Calculator.sub(n1, n2);
        assertEquals(expResult, result);
    }

    @Test
    public void testDiv() {
        System.out.println("div");
        int n1 = 6;
        int n2 = 3;
        int expResult = 2;
        int result = Calculator.div(n1, n2);
        assertEquals(expResult, result);
    }

    @Test
    public void testMul() {
        System.out.println("mul");
        int n1 = 2;
        int n2 = 2;
        int expResult = 4;
        int result = Calculator.mul(n1, n2);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod() {
        System.out.println("mod");
        int n1 = 2;
        int n2 = 2;
        int expResult = 0;
        int result = Calculator.mod(n1, n2);
        assertEquals(expResult, result);
    }   
}