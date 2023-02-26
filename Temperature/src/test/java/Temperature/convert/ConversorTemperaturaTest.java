package Temperature.convert;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import temperature.convert.ConversorTemperatura;

public class ConversorTemperaturaTest {
    
    public ConversorTemperaturaTest() {
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