package com.micronautstudies.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class MyApplicationTest {
    @Inject
    private MyApplication myApplication;

    @Test
    void shouldLogToFile() {
        myApplication.process();
    }

}