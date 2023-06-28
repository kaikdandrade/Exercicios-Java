package anobissexto;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnoBissextoTest {
    
    public AnoBissextoTest() {
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
    public void testIsBissexto() {
        System.out.println("isBissexto");
        AnoBissexto instance = new AnoBissexto(2020);
        boolean expResult = true;
        boolean result = instance.isBissexto();
        assertEquals(expResult, result);
    }
}
