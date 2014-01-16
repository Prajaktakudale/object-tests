package StringTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void TestForCheckEqualityOfLiterals() throws Exception {
        Boolean result = "Prajakta".equals("Prajakta");

        assertEquals(true, result);
    }

    @Test
    public void TestForCheckLiteralsAreNotEqual() throws Exception {
        Boolean result = "Prajakta".equals("Kudale");

        assertEquals(false, result);
    }

    @Test
    public void TestForCheckStringConstructorAreEqual() throws Exception {
        String person1 = new String("Prajakta");
        String person2 = new String("Prajakta");

        Boolean result = person1.equals(person2);

        assertEquals(true, result);
    }

    @Test
    public void TestForCheckStringConstructorAreNotEqual_() throws Exception {
        String person1 = new String("Prajakta");
        String person2 = new String("Kudale");

        Boolean result = person1.equals(person2);

        assertEquals(false, result);
    }

    @Test
    public void TestForCheckStringConstructorAndLiteralAreEqual() throws Exception {
        String person1 = new String("Prajakta");

        Boolean result = person1.equals("Prajakta");

        assertEquals(true, result);
    }

    @Test
    public void TestForCheckStringConstructorAndLiteralNotEqual() throws Exception {
        String person1 = new String("Prajakta");

        Boolean result = person1.equals("Kudale");

        assertEquals(false, result);
    }
}
