package com.micronautstudies.qualifier;

import jakarta.inject.Singleton;

@Singleton
public class TestandoLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Testando");
    }
}
