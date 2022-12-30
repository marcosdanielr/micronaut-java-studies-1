package lifecycle;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class PersonTest {
    @Inject
    private Person person;

    @Test void shouldInitializePerson() {
        assertEquals("Marcos", person.getName());
    }

}