package temperature;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperaturaCelsiusTest {

    public TemperaturaCelsiusTest() {
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
    public void testConverteCelsiusParafahrenheit() {
        System.out.println("converteCelsiusParafahrenheit");
        TemperaturaCelsius instance = new TemperaturaCelsius(32.0);
        double expResult = 89.6;
        double result = instance.converteCelsiusParafahrenheit();
        assertEquals(expResult, result, 0);
    }
}
