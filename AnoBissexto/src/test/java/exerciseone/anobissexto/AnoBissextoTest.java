package exerciseone.anobissexto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnoBissextoTest {
    
    public AnoBissextoTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsBissexto() {
        System.out.println("isBissexto");
        AnoBissexto instance = new AnoBissexto(2020);
        boolean expResult = true;
        boolean result = instance.isBissexto();
        assertEquals(expResult, result);
    }
}