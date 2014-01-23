package Person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;



public class PersonTest {
    public List addPeopleToList(Person... persons) {
        List<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            people.add(person);
        }
        return people;
    }

    @Test
    public void TestForComparePersonNameLengthUsingEqual() throws Exception {

        Person Prajakta = new Person("Prajakta", 3);
        Person Pranali = new Person("Pranali", 50);
        Person Arya = new Person("Arya", 35);

        List<Person> people = addPeopleToList(Arya, Pranali, Prajakta);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length() - p2.getName().length();
            }
        });

        assertEquals(true, Arya.equals(people.get(0)));
        assertEquals(true, Pranali.equals(people.get(1)));
        assertEquals(true, Prajakta.equals(people.get(2)));
    }

    @Test
    public void TestForCompareNameUsingEquals() throws Exception {
        Person Prajakta = new Person("Prajakta", 3);
        Person Pranali = new Person("Pranali", 50);
        Person Arya = new Person("Arya", 35);

        List<Person> people = addPeopleToList(Arya, Pranali, Prajakta);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        assertEquals(true, Arya.equals(people.get(0)));
        assertEquals(true, Prajakta.equals(people.get(1)));
        assertEquals(true, Pranali.equals(people.get(2)));
    }


    @Test
    public void TestForCompareAgeUsingEqual() throws Exception {
        Person Prajakta = new Person("Prajakta", 3);
        Person Pranali = new Person("Pranali", 50);
        Person Arya = new Person("Arya", 35);

        List<Person> people = addPeopleToList(Arya, Pranali, Prajakta);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (p1.getAge()) - (p2.getAge());
            }
        });

        assertEquals(true, Prajakta.equals(people.get(0)));
        assertEquals(true, Arya.equals(people.get(1)));
        assertEquals(true, Pranali.equals(people.get(2)));
    }

    @Test
    public void TestForCompareNameInReverseOrder() throws Exception {
        Person Prajakta = new Person("Prajakta", 3);
        Person Pranali = new Person("Pranali", 50);
        Person Arya = new Person("Arya", 35);

        List<Person> people = addPeopleToList(Arya, Pranali, Prajakta);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getName().compareTo(p1.getName());
            }
        });

        assertEquals(true, Pranali.equals(people.get(0)));
        assertEquals(true, Prajakta.equals(people.get(1)));
        assertEquals(true, Arya.equals(people.get(2)));
    }

}