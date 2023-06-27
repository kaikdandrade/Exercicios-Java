package exerciseone.matematicamaluca;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicaMalucaTest {

    public MatematicaMalucaTest() {
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
    public void testNum1() {
        System.out.println("testNum");
        MatematicaMaluca instance = new MatematicaMaluca(40);
        int expResult = 160;
        int result = instance.getNum();
        assertEquals(expResult, result);
    }

    @Test
    public void testNum2() {
        System.out.println("testNum");
        MatematicaMaluca instance = new MatematicaMaluca(20);
        int expResult = 60;
        int result = instance.getNum();
        assertEquals(expResult, result);
    }

    @Test
    public void testNum3() {
        System.out.println("testNum");
        MatematicaMaluca instance = new MatematicaMaluca(5);
        int expResult = 10;
        int result = instance.getNum();
        assertEquals(expResult, result);
    }
}
