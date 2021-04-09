package me.cordones;

import com.oreilly.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssertTest {

    @Test
    public void testAssertAll() {
        Person person = new Person("Rafael", "Cordones", LocalDate.of(1975, Month.JUNE, 28));
        assumeTrue(person.getAge() > 100, "Person cannot be null");
        assertAll("Person properties",
                () -> assertEquals("Rafael", person.getFirst()),
                () -> assertEquals("Cordones", person.getLast()),
                () -> assertEquals("Rafael Cordones", person.getName())
        );
    }

}
