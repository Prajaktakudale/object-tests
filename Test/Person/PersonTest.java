package Person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;


class MyClass {
    public static List addPeopleToList(Person... persons) {
        List<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            people.add(person);
        }
        return people;
    }
}

public class PersonTest {
    Person swamiji = new Person("Swamiji", 3);
    Person kunal = new Person("Kunal", 50);
    Person digvijay = new Person("Digvijay", 35);

    @Test
    public void test_for_compare_personName_length_using_equal() throws Exception {

        List<Person> people = MyClass.addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length() - p2.getName().length();
            }
        });
        assertEquals(true, kunal.equals(people.get(0)));
        assertEquals(true, swamiji.equals(people.get(1)));
        assertEquals(true, digvijay.equals(people.get(2)));

    }

    @Test
    public void test_for_compare_name_using_equals() throws Exception {
        List<Person> people = MyClass.addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        assertEquals(true, digvijay.equals(people.get(0)));
        assertEquals(true, kunal.equals(people.get(1)));
        assertEquals(true, swamiji.equals(people.get(2)));
    }


    @Test
    public void test_for_compare_age_using_equal() throws Exception {
        List<Person> people = MyClass.addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (p1.getAge()) - (p2.getAge());
            }
        });
        assertEquals(true, swamiji.equals(people.get(0)));
        assertEquals(true, digvijay.equals(people.get(1)));
        assertEquals(true, kunal.equals(people.get(2)));
    }

    @Test
    public void test_for_compare_name_in_reverse_order() throws Exception {
        List<Person> people = MyClass.addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getName().compareTo(p1.getName());

            }
        });
        assertEquals(true, swamiji.equals(people.get(0)));
        assertEquals(true, kunal.equals(people.get(1)));
        assertEquals(true, digvijay.equals(people.get(2)));
    }
}