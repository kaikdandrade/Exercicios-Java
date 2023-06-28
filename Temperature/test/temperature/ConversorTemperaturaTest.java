package temperature;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTemperaturaTest {

    public ConversorTemperaturaTest() {
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
    public void testConverteCelsiusParaFahrenheit() {
        System.out.println("converteCelsiusParaFahrenheit");
        double celsius = 32;
        double expResult = 89.6;
        double result = ConversorTemperatura.converteCelsiusParaFahrenheit(celsius);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testConverteFahrenheitParaCelsius() {
        System.out.println("converteFahrenheitParaCelsius");
        double fahrenheit = 89.6;
        double expResult = 32;
        double result = ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit);
        assertEquals(expResult, result, 0);
    }
}
