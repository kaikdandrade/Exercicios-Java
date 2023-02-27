package dice;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    public DiceTest() {
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