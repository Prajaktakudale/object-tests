package ExceptionTests;

import java.util.ArrayList;
import org.junit.Test;


public class ArrayListException {
    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast() throws ClassCastException {
        ArrayList list = new ArrayList<String>();
        list.add(new Object());
        list.add(new Object());
        String prajakta = (String) list.get(0);
    }
}