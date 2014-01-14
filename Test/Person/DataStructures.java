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
    public void test_for_check_equal_when_data_are_same() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Praju", 18);

        assert (praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    @Test
    public void test_for_check_equal_when_data_are_not_same() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Prajuk", 18);

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    @Test
    public void test_for_check_equal_when_reference_is_same() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = praju1;

        assert (praju1.equals(praju2));
        assertEquals(true, praju1 == praju2);
    }

    @Test
    public void test_for_check_equal_when_one_is_null() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = null;

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);

    }
    //worng implementation

    @Test
    public void test_for_check_equal_when_data_are_same_wrong_impementation() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        PersonWorngImpementation praju2 = new PersonWorngImpementation("Prajakta", 18);

        assertEquals(false, praju1.equals(praju2));
        assertEquals(false, praju1 == praju2);
    }

    //======================================================HashCode============================================================
    @Test
    public void test_for_check_hashcode_() throws Exception {
        Person praju1 = new Person("Praju", 18);

        int hash = praju1.hashCode();
        int hash2 = praju1.hashCode();

        assert (hash == hash2);
    }

    //worng impementation

    @Test
    public void hashworng() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);

        int hash = praju1.hashCode();
        int hash2 = praju1.hashCode();

        assertEquals(false, hash == hash2);
    }


    //===================================================HashMap============================================================

    @Test
    public void test_for_HashMap_to_check_allow_different_keys_to_inserted() throws Exception {
        Person praju1 = new Person("praju", 18);
        Person praju2 = new Person("prajakta", 18);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju2.hashCode()), praju2);

        assert (2 == people.size());
    }

    @Test
    public void test_for_check_HashMap_overeide_data_when_keys_are_same() throws Exception {
        Person praju1 = new Person("praju", 18);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju1.hashCode()), praju1);

        assert (1 == people.size());
    }

    //wrong implementation
    @Test
    public void test_for_check_HashMap_allow_same_data_to_inserted() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("praju", 19);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(praju1.hashCode()), praju1);
        people.put(new Integer(praju1.hashCode()), praju1);

        assert (2 == people.size());
    }

    //==================================================Set===============================================================
    @Test
    public void test_for_check_different_data_inserting_allow() throws Exception {
        Person praju1 = new Person("praju", 18);
        Person praju2 = new Person("prajakta", 18);
        Set<Person> people = new HashSet<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }

    @Test
    public void test_for_not_allow_to_inserting_when_data_is_same() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Set<Person> people = new HashSet<Person>();

        people.add(praju1);
        people.add(praju1);

        assert (1 == people.size());
    }

    //worng implementation

    @Test
    public void test_for_cheak_allow_inserting_data_is_same() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        Set<PersonWorngImpementation> people = new HashSet<PersonWorngImpementation>();

        people.add(praju1);
        people.add(praju1);

        assert (2 == people.size());
    }

    //=====================================================Arraylist===========================================
    @Test
    public void test_for_check_allow_insertion_of_same_data() throws Exception {
        Person praju1 = new Person("Praju", 18);
        Person praju2 = new Person("Praju", 18);
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }

    //worng implementation

    @Test
    public void test_for_check_does_not_allow_insertion_of_same_data() throws Exception {
        PersonWorngImpementation praju1 = new PersonWorngImpementation("Praju", 18);
        PersonWorngImpementation praju2 = new PersonWorngImpementation("Prajakta", 18);
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(praju1);
        people.add(praju2);

        assert (2 == people.size());
    }
}