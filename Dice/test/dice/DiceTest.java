package dice;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    public DiceTest() {
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
    public void testInvalidNumber() {
        System.out.println("invalidNumber");
        Dice instance = new Dice();
        int expResult = 1;
        instance.setNumber(8);
        int result = instance.getNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidNumber() {
        System.out.println("validNumber");
        Dice instance = new Dice();
        int expResult = 5;
        instance.setNumber(5);
        int result = instance.getNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testPlayDice() {
        System.out.println("playDice");
        Dice dice = new Dice();
        int expResult = 6;
        ArrayList results = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            dice.playDice();
            results.add(dice.getNumber());
        }
        assertEquals(expResult, results.size());
    }
}
