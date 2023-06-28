package matematicamaluca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaMalucaTest {

    public MatematicaMalucaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
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
