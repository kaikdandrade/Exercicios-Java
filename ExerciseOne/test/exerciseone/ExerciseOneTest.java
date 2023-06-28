package exerciseone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseOneTest {

    public ExerciseOneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Ocorre antes de todos os testes!");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Ocorre depois de todos os testes!");
    }

    @Before
    public void setUp() {
        System.out.println("Ocorre antes de cada teste!");
    }

    @After
    public void tearDown() {
        System.out.println("Ocorre depois de cada teste!");
    }

    // Testa nomes com espaços desnecessários.
    @Test
    public void testName() {
        ExerciseOne ex = new ExerciseOne();
        ex.setFirstName("    Joca    ");
        ex.setLastName("    Silva    ");
        assertEquals("Joca", ex.getFirstName());
        assertEquals("Silva", ex.getLastName());
    }

    // Testa quando não insere um nome, retorna null.
    @Test
    public void testEmptyName() {
        ExerciseOne ex = new ExerciseOne();
        ex.setFirstName("    ");
        ex.setLastName("      ");
        assertNull(ex.getFirstName());
        assertNull(ex.getLastName());
    }

    // Testa sanitização e formato da data de nascimento.
    @Test
    public void testValidBirthDate() {
        ExerciseOne ex = new ExerciseOne();
        ex.setBirthDate("  10/11/2001   ");
        assertEquals("10/11/2001", ex.getBirthDate());
    }

    // Testa se a data retorna "null" se estiver inválida ou vazia.
    @Test
    public void testInvalidBirthDate() {
        ExerciseOne ex = new ExerciseOne();
        ex.setBirthDate("  10-11   ");
        assertNull(ex.getBirthDate());
        ex.setBirthDate("  ");
        assertNull(ex.getBirthDate());
    }

    // Testa se obtém o nome completo.
    @Test
    public void testFullname() {
        ExerciseOne ex = new ExerciseOne();
        ex.setFirstName("    Joca    ");
        ex.setLastName("    Silva    ");
        assertEquals("Joca Silva", ex.getFullName());
    }

    // Testa se obtém a idade com base na data de nascimento.
    @Test
    public void testGetAge() {
        ExerciseOne ex = new ExerciseOne();
        ex.setBirthDate("  10/11/2001   ");
        assertEquals(21, ex.getAge());
    }

    // Testa se a idade retorna "0" se a data de nascimento é inválida.
    @Test
    public void testInvalidBirthDateAge() {
        ExerciseOne ex = new ExerciseOne();
        ex.setBirthDate("  10-11   ");
        assertEquals(0, ex.getAge());
        ex.setBirthDate("  ");
        assertEquals(0, ex.getAge());
    }
}
