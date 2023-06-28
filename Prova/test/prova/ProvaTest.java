package prova;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProvaTest {

    public ProvaTest() {
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
    public void testVetor() {
        System.out.println("vetor");
        int[] vet = {89, 90, 84, 91};
        int r = Prova.vetor(vet.length, vet);
        assertEquals(84, r);
    }
}
