package com.micronautstudies.qualifier;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class MyApplication {
    private final Logger logger;

    // @Named call file name. For exemple: ConsoleLogger and FileLogger is @Name("console") or @Name("file)
    public MyApplication(@Console Logger logger) {
        this.logger = logger;
    }

    public void process() {
        System.out.println("Processing");
        logger.log();
    }
}
