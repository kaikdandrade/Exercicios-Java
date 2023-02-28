package exerciseone.testepalindromo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestePalindromoTest {

    public TestePalindromoTest() {
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
    public void testValidPalindromo() {
        System.out.println("validVerificaPalindromo");
        String palavra = "pop";
        boolean expResult = true;
        boolean result = TestePalindromo.verificaPalindromo(palavra);
        assertEquals(expResult, result);
    }

    @Test
    public void testInvalidPalindromo() {
        System.out.println("invalildVerificaPalindromo");
        String palavra = "pipoca";
        boolean expResult = false;
        boolean result = TestePalindromo.verificaPalindromo(palavra);
        assertEquals(expResult, result);
    }
}
