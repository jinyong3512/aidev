package kr.co.shinhands.edu.aidev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    @Test
    void testPersonCreation() {
        Person person = new Person("John Doe", 30);
        assertNotNull(person);
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    void testPersonAgeIncrement() {
        Person person = new Person("Jane Doe", 25);
        person.incrementAge();
        assertEquals(26, person.getAge());
    }

    @Test
    void testPersonNameChange() {
        Person person = new Person("Bob Smith", 40);
        person.setName("Robert Smith");
        assertEquals("Robert Smith", person.getName());
    }

    @Test
    void testPersonToString() {
        Person person = new Person("Alice Johnson", 35);
        String expected = "Person{name='Alice Johnson', age=35}";
        assertEquals(expected, person.toString());
    }

    @Test
    void testPersonWithNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Person("Invalid", -5));
    }

    @Test
    void testPersonWithNullName() {
        assertThrows(NullPointerException.class, () -> new Person(null, 20));
    }
}
