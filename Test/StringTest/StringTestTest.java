package StringTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTestTest {
    @Test
    public void test_for_check_equality_of_literals() throws Exception {
        Boolean result = "Prajakta".equals("Prajakta");
        assertEquals(true, result);
    }

    @Test
    public void test_for_check_literals_are_not_equal() throws Exception {
        Boolean result = "Prajakta".equals("Kudale");
        assertEquals(false, result);
    }

    @Test
    public void test_for_check_string_constructor_are_equal() throws Exception {
        String person1 = new String("Prajakta");
        String person2 = new String("Prajakta");
        Boolean result = person1.equals(person2);
        assertEquals(true, result);
    }

    @Test
    public void test_for_check_string_constructor_are_not_equal_() throws Exception {
        String person1 = new String("Prajakta");
        String person2 = new String("Kudale");
        Boolean result = person1.equals(person2);
        assertEquals(false, result);
    }

    @Test
    public void test_for_check_string_constructor_and_literal_are_equal() throws Exception {
        String person1 = new String("Prajakta");
        Boolean result = person1.equals("Prajakta");
        assertEquals(true, result);
    }

    @Test
    public void test_for_check_string_constructor_and_literal_not_equal() throws Exception {
        String person1 = new String("Prajakta");
        Boolean result = person1.equals("Kudale");
        assertEquals(false, result);
    }
}
