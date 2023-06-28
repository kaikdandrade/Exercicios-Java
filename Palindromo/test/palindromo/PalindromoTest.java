package palindromo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {

    public PalindromoTest() {
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
    public void testValidPalindromo() {
        System.out.println("validVerificaPalindromo");
        String palavra = "pop";
        boolean expResult = true;
        boolean result = Palindromo.verificaPalindromo(palavra);
        assertEquals(expResult, result);
    }

    @Test
    public void testInvalidPalindromo() {
        System.out.println("invalildVerificaPalindromo");
        String palavra = "pipoca";
        boolean expResult = false;
        boolean result = Palindromo.verificaPalindromo(palavra);
        assertEquals(expResult, result);
    }
}
