package com.micronautstudies.qualifier;
import jakarta.inject.Singleton;

@Singleton
public class FileLogger implements  Logger {
    @Override
    public void log() {
        System.out.println("Logging the message to file");
    }
}
