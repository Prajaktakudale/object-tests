package Person;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DataStructures {
 //=======================================================Equals=======================================================
    @Test
    public void TestForCheckEqualWhenDataAreSame() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Praju", 18);

        assert (praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    @Test
    public void TestForCheckEqualWhenDataAreNotSame() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Prajuk", 18);

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    @Test
    public void TestForCheckEqualWhenReferenceIsSame() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = praju1;

        assert (praju1.equals(praju2));
        assertEquals(true, praju1 == praju2);
    }

    @Test
    public void TestForCheckEqualWhenOneIsNull() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = null;

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);

    }
    //worng implementation of Equals.

    @Test
    public void TestForCheckEqualWhenDataAreSameWrongImpementation() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        PersonWorngImpementation praju2 = new PersonWorngImpementation("Prajakta", 18);

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    //======================================================HashCode============================================================
    @Test
    public void TestForCheckHashcode_() throws Exception {
        Person praju1 = new Person("Praju", 18);

        int hash = praju1.hashCode();
        int hash2 = praju1.hashCode();

        assert (hash == hash2);
    }

    //worng impementation

    @Test
    public void TestForHashCodeWorngImpementation() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);

        int hash = praju1.hashCode();
        int hash2 = praju1.hashCode();

        assertEquals(false, hash == hash2);
    }


    //===================================================HashMap============================================================

    @Test
    public void TestForHashMapToCheckAllowDifferentKeysToInserted() throws Exception {
        Person praju1 = new Person("praju", 18);
        Person praju2 = new Person("prajakta", 18);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju2.hashCode()), praju2);

        assert (2 == people.size());
    }

    @Test
    public void TestForCheckHashMapOvereideDataWhenKeysAreSame() throws Exception {
        Person praju1 = new Person("praju", 18);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju1.hashCode()), praju1);

        assert (1 == people.size());
    }

    //wrong implementation
    @Test
    public void TestForCheckHashMapAllowSameDataToInserted() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("praju", 19);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju1.hashCode()), praju1);

        assert (2 == people.size());
    }

    //==================================================Set===============================================================
    @Test
    public void TestForCheckDifferentDataInsertingAllow() throws Exception {
        Person praju1 = new Person("praju", 18);
        Person praju2 = new Person("prajakta", 18);
        Set<Person> people = new HashSet<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }

    @Test
    public void TestForNotAllowToInsertingWhenDataIsSame() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Set<Person> people = new HashSet<Person>();

        people.add(praju1);
        people.add(praju1);

        assert (1 == people.size());
    }

    //worng implementation

    @Test
    public void TestForCheakAllowInsertingDataIsSame() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        Set<PersonWorngImpementation> people = new HashSet<PersonWorngImpementation>();

        people.add(praju1);
        people.add(praju1);

        assert (2 == people.size());
    }

    //=====================================================Arraylist===========================================
    @Test
    public void TestForCheckAllowInsertionOfSameData() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Praju", 18);
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }

    //worng implementation

    @Test
    public void TestForCheckDoesNotAllowInsertionOfSameData() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        PersonWorngImpementation praju2 = new PersonWorngImpementation("Prajakta", 18);
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }
}